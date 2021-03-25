package GRPC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import org.DS.xinqipeiproject.SmartOfficeGRPC.Empty;
import org.DS.xinqipeiproject.SmartOfficeGRPC.ComputerControlSystemServiceGrpc.ComputerControlSystemServiceImplBase;
import org.DS.xinqipeiproject.SmartOfficeGRPC.booleanRequest;
import org.DS.xinqipeiproject.SmartOfficeGRPC.booleanResponse;
import org.DS.xinqipeiproject.SmartOfficeGRPC.computercontrolsystemResponse;
import org.DS.xinqipeiproject.SmartOfficeGRPC.stringRequest;
import org.DS.xinqipeiproject.SmartOfficeGRPC.stringResponse;
import org.DS.xinqipeiproject.SmartOfficeGRPC.valueRequest;
import org.DS.xinqipeiproject.SmartOfficeGRPC.valueResponse;

import io.grpc.stub.StreamObserver;

import com.google.protobuf.Int32ValueOrBuilder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import Models.ComputerControlSystem;

import io.grpc.stub.StreamObserver;

public class ComputerControlSystemServer extends ComputerControlSystemServiceImplBase{
	
	private static final Logger logger = Logger.getLogger(RadiatorsServer.class.getName());
	public ComputerControlSystem myComputerControlSystem = new ComputerControlSystem();
	public static int computercontrolsystemPort;
	
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
			if (event.getName().equals("ComputerControlSystem")) {
				System.out.println("Found ComputerControlSystem port: " + event.getInfo().getPort());
				try {
					computercontrolsystemPort = event.getInfo().getPort();
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
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		ComputerControlSystemServer computercontrolsystemServer = new ComputerControlSystemServer();
		Server server = ServerBuilder.forPort(portNumber).addService(computercontrolsystemServer).build().start();

		logger.info("ComputerControlSystemServer started, listening on " + portNumber);

		server.awaitTermination();
	}
	
	

	public void initialItem(Empty request, StreamObserver<computercontrolsystemResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving initial item request for ComputerControlSystem ");
		String status;
		
		if(myComputerControlSystem.isOn()) {
			status = "On";
		}
		else {
			status = "Off";
		}
		String aName = myComputerControlSystem.getitemName();
		String aStatus = status;
		Integer aVolume = myComputerControlSystem.getvolume();
		
		computercontrolsystemResponse response = computercontrolsystemResponse.newBuilder().setAname(aName).setStatus(aStatus).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}


	@Override
	public void onOff(booleanRequest request, StreamObserver<booleanResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving information about On/Off for ComputerControlSystem");
		Boolean onOff = request.getMsg();
		myComputerControlSystem.setOn(onOff);
		
		//print out
		booleanResponse response = booleanResponse.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeItemName(stringRequest request, StreamObserver<stringResponse> responseObserver) {
		// TODO Auto-generated method stub
		String name = request.getText();
		System.out.println("Changing computercontrolsystem name to "+name);

		myComputerControlSystem.setitemName(name);
		 
		stringResponse response = stringResponse.newBuilder().setText(name).build();
		System.out.println("Response "+response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}


}
