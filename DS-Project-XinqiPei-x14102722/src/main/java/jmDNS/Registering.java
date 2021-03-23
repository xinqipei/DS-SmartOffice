package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import Models.*;

public class Registering {
	public static JmDNS jmdns;

	// TODO Auto-generated method stub
	public static void main(String[] args) throws UnknownHostException, IOException {

	}

	public void jmndsRegister(int radiatorsPort, int computercontrolsystemPort, int lightingPort, int camPort)
			throws InterruptedException {

		Radiators myRadiators = new Radiators();
		ComputerControlSystem myComputerControlSystem = new ComputerControlSystem();
		Lighting myLighting = new Lighting();

		try {
			// Create a JmDNS instance
			// JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns = JmDNS.create(InetAddress.getLocalHost());
			// Registering all services
			System.out.println("Registering");
			ServiceInfo serviceRadiators = ServiceInfo.create("_http._tcp.local.", myRadiators.getAppliance(), radiatorsPort,
					"path=index.html");
			ServiceInfo serviceProjector = ServiceInfo.create("_http._tcp.local.", myComputerControlSystem.getAppliance(),
					computercontrolsystemPort, "path=index.html");
			ServiceInfo serviceLighting = ServiceInfo.create("_http._tcp.local.", myLighting.getAppliance(), lightingPort,
					"path=index.html");

			jmdns.registerService(serviceRadiators);
			jmdns.registerService(serviceProjector);
			jmdns.registerService(serviceLighting);

			// Wait a bit
			// Thread.sleep(25000);

			// Unregister all services
			// jmdns.unregisterAllServices();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void unRegister() {
		System.out.println("Un-registering");

		jmdns.unregisterAllServices();

	}

}
