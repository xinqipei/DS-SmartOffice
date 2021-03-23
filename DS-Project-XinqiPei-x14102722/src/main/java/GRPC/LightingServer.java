package GRPC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import org.DS.xinqipei.SmartOfficeGRPC.Empty;
import org.DS.xinqipei.SmartOfficeGRPC.LightingServiceGrpc.LightingServiceImplBase;
import org.DS.xinqipei.SmartOfficeGRPC.booleanRequest;
import org.DS.xinqipei.SmartOfficeGRPC.booleanResponse;
import org.DS.xinqipei.SmartOfficeGRPC.lightResponse;
import org.DS.xinqipei.SmartOfficeGRPC.stringRequest;
import org.DS.xinqipei.SmartOfficeGRPC.stringResponse;
import org.DS.xinqipei.SmartOfficeGRPC.valueRequest;
import org.DS.xinqipei.SmartOfficeGRPC.valueResponse;

import io.grpc.stub.StreamObserver;

import com.google.protobuf.Int32ValueOrBuilder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import Models.Lighting;

public class LightingServer extends LightingServiceImplBase{
	private static final Logger logger = Logger.getLogger(LightingServer.class.getName());
	public Lighting myLighting = new Lighting();
	public static int lightPort;
	
	private static class SampleListener implements ServiceListener {
		 
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        
        public void serviceResolved(ServiceEvent event) {
        	System.out.println("Service resolved: " + event.getInfo());
            System.out.println("Get Name: " + event.getName()+" PORT: "+event.getInfo().getPort());
            
            //Start GRPC server with discovered device
            if(event.getName().equals("Lighting")) {
            	System.out.println("Found Lighting port: " + event.getInfo().getPort());
	       		try {
	       			lightPort = event.getInfo().getPort();
					startGRPC(event.getInfo().getPort());
	       		} 
	       		catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	       		catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
          

        }
    }
	
	public static void main(String[] args) throws IOException, InterruptedException  {	 
		 startDiscovery();
	}
	
	public static void startDiscovery() throws IOException, InterruptedException {
		try {
		    // Create a JmDNS instance
		    JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	
		    // Add a service listener
		    jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
		    System.out.println("Listening");
		    // Wait a bit
		    Thread.sleep(30000);
	    } 
		catch (UnknownHostException e) {
			System.out.println(e.getMessage());
	    } 
		catch (IOException e) {
			System.out.println(e.getMessage());
	    }
	}
	
	public int getLightingPort() {
		return lightPort;
	}

	public void setLightingPort(int lightPort) {
		LightingServer.lightPort = lightPort;
	}
	
	public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		LightingServer lightServer = new LightingServer();
		    
		Server server = ServerBuilder.forPort(portNumber).addService(lightServer).build().start();
		logger.info("LightingServer started, listening on " + portNumber);		     
		server.awaitTermination();
	 }
	

	@Override
	public void initialAppliance(Empty request, StreamObserver<lightResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving initial appliance request for Lightings");
		String status;
		
		if(myLighting.isOn()) {
			  status ="On";
		}
		else {
			  status ="Off";

		}
		String aName = myLighting.getApplianceName();
		String aStatus = status;
		Integer aBrightness = myLighting.getBrightness();
		
		//print out
		lightResponse response = lightResponse.newBuilder().setAname(aName).setStatus(aStatus).setBrightness(aBrightness).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeBrightness(valueRequest request, StreamObserver<valueResponse> responseObserver) {//start changeBrightness method
		// TODO Auto-generated method stub
		int currentBrightness= myLighting.getBrightness();
		int changeBrightness = request.getLength();
		
		System.out.println("Receiving new brightness for lights" + currentBrightness);
		int newBrightness = currentBrightness + changeBrightness;
		if(newBrightness > 100 || newBrightness < 0 ) {//start if
			System.out.println("Brightness cannot exceed 100 or be less than 0: " + newBrightness);
			System.out.println("The current brightness is set to: " + myLighting.getBrightness());
			
			valueResponse response = valueResponse.newBuilder().setLength(myLighting.getBrightness()).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}//end if
		else {//start else
			myLighting.setBrightness(newBrightness);
			System.out.println("The updated brightness level is: " + newBrightness);		
			valueResponse response = valueResponse.newBuilder().setLength(newBrightness).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}//end else
		
	}//end changeBrightness method

	@Override
	public void onOff(booleanRequest request, StreamObserver<booleanResponse> responseObserver) {//start onOff method
		// TODO Auto-generated method stub
		System.out.println("Receiving information about On/Off for Lightings");
		Boolean onOff = request.getMsg();
		myLighting.setOn(onOff);
		
		//print out
		booleanResponse response = booleanResponse.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}//end onOff method

	@Override
	public void changeApplianceName(stringRequest request, StreamObserver<stringResponse> responseObserver) {
		// TODO Auto-generated method stub
		String name = request.getText();
		System.out.println("Changing light name to "+name);

		myLighting.setApplianceName(name);
		 
		stringResponse response = stringResponse.newBuilder().setText(name).build();
		System.out.println("Response "+response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
	

}
