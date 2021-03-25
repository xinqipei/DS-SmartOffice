package GRPC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import org.DS.xinqipeiproject.SmartOfficeGRPC.Empty;
import org.DS.xinqipeiproject.SmartOfficeGRPC.RadiatorsServiceGrpc.RadiatorsServiceImplBase;
import org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest;
import org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse;
import org.DS.xinqipeiproject.SmartOfficeGRPC.radiatorsResponse;
import org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest;
import org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse;
import org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest;
import org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse;

import io.grpc.stub.StreamObserver;

import com.google.protobuf.Int32ValueOrBuilder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import Models.Radiators;

public class RadiatorsServer extends RadiatorsServiceImplBase{
	private static final Logger logger = Logger.getLogger(RadiatorsServer.class.getName());
	public Radiators myRadiators = new Radiators();
	public static int RadiatorsPort;
	
	private static class SampleListener implements ServiceListener {//start class

		public void serviceAdded(ServiceEvent event) {
			System.out.println("Service added: " + event.getInfo());

		}

		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}

		public void serviceResolved(ServiceEvent event) {
			System.out.println("Service resolved: " + event.getInfo());
			System.out.println("Get Name: " + event.getName() + " PORT: " + event.getInfo().getPort());

			// Start GRPC server with discovered device
			if (event.getName().equals("Radiators")) {
				System.out.println("Found Radiators port: " + event.getInfo().getPort());
				try {
					RadiatorsPort = event.getInfo().getPort();
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
	}//end method

	public static void main(String[] args) throws IOException, InterruptedException {
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

	public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		RadiatorsServer RadiatorsServer = new RadiatorsServer();
		Server server = ServerBuilder.forPort(portNumber).addService(RadiatorsServer).build().start();

		logger.info("Radiators Server started, listening on " + portNumber);

		server.awaitTermination();
	}

	@Override
	public void initialItem(Empty request, StreamObserver<radiatorsResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving initial item request for TV ");
		String status;
		
		if(myRadiators.isOn()) {
			status = "On";
		}
		else {
			status = "Off";
		}
		
		String aName = myRadiators.getitemName();
		String aStatus = status;
		Integer aTemperature = myRadiators.getTemperature();
	
		
		radiatorsResponse response = radiatorsResponse.newBuilder().setAname(aName).setStatus(aStatus).setTemperature(aTemperature).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}

	@Override
	public void changeTemperature(valueRequest request, StreamObserver<valueResponse> responseObserver) {
		// TODO Auto-generated method stub
		int currentTemperature = myRadiators.getTemperature();
		int changeTemperature = request.getLength();
		
		System.out.println("Updated new radiator temperature " + currentTemperature);
		int newTemperature = currentTemperature + changeTemperature;
		if(newTemperature > 35 || newTemperature < 15 ) {//start if
			System.out.println("Temperature cannot go over 35 or less than 15: " + newTemperature);
			System.out.println("The temperature is: " + myRadiators.getTemperature());
			
			valueResponse response = valueResponse.newBuilder().setLength(myRadiators.getTemperature()).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}//end if
		else {//start else
			myRadiators.setTemperature(newTemperature);
			System.out.println("The updated temperature is: " + newTemperature);		
			valueResponse response = valueResponse.newBuilder().setLength(newTemperature).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}//end else
		
	}


	@Override
	public void onOff(booleanRequest request, StreamObserver<booleanResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving information about On/Off for Radiators");
		Boolean onOff = request.getMsg();
		myRadiators.setOn(onOff);
		
		//print out
		booleanResponse response = booleanResponse.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeItemName(stringRequest request, StreamObserver<stringResponse> responseObserver) {
		// TODO Auto-generated method stub
		String name = request.getText();
		System.out.println("Changing projector name to "+name);

		myRadiators.setitemName(name);
		 
		stringResponse response = stringResponse.newBuilder().setText(name).build();
		System.out.println("Response "+response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	 public StreamObserver<stringRequest> changeDeviceNameStream(final StreamObserver<stringResponse> responseObserver){
		return new StreamObserver<stringRequest>() {

			@Override
			public void onNext(stringRequest value) {
				// TODO Auto-generated method stub
				System.out.println("Next text value " + value.getText());
				stringResponse resp = stringResponse.newBuilder().setText(value.getText()).build();
				responseObserver.onNext(resp);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				responseObserver.onCompleted();
			}
			
		};
		 
	 }
	
}
