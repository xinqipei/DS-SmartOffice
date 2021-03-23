package Models;

public class Radiators {
	private String appliance, applianceName;
	private boolean on;
	private int temperature;
	private int speed;
	
	public Radiators() {
		this.appliance="Radiators";
		this.on=true;
		this.applianceName="Radiators Name";
		this.temperature=20;
		this.speed=1;
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

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
