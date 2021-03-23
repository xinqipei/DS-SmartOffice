package Models;

public class ComputerControlSystem {
	private String appliance, applianceName;
	private boolean on;
	private int volume;
	
	public ComputerControlSystem() {
		this.appliance = "ComputerControlSystem";
		this.on = true;
		this.applianceName = "ComputerControlSystem Name";
		this.volume = 50;
	}

	public String getAppliance() {
		return appliance;
	}

	public void setAppliance(String appliance) {
		this.appliance = appliance;
	}

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getvolume() {
		return volume;
	}

	public void setvolume(int volume) {
		this.volume = volume;
	}
	
}
