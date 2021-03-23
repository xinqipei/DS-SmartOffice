package jmDNS;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

public class Discovering {
	
	private static int ComputerControlSystemPort;

	public int getComputerControlSystemPort() {
		return ComputerControlSystemPort;
	}

	public void setComputerControlSystemPort(int sprinklerPort) {
		ComputerControlSystemPort = sprinklerPort;
	}

	public static class SampleListener implements ServiceListener {
		public void serviceAdded(ServiceEvent event) {
			System.out.println("Service addedPORT?: " + event.getInfo().getPort());

		}

		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}

		public void serviceResolved(ServiceEvent event) {
			System.out.println("Service resolved: " + event.getInfo());
			System.out.println("Get Name: " + event.getName() + " PORT: " + event.getInfo().getPort());
			if (event.getName().equals("ComputerControlSystem")) {
				System.out.println("Found ComputerControlSystem port: " + event.getInfo().getPort());
				ComputerControlSystemPort = event.getInfo().getPort();
			}

		}
	}
	
	public static void main(String[] args) throws InterruptedException {
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        
            // Add a service listener
            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
            System.out.println("Listening");
            // Wait a bit
            Thread.sleep(3000);
        } 
        catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
	

}
