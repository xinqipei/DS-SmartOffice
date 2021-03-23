package Models;

public class Lighting {
	private String appliance, applianceName;
	private boolean on;
	private int brightness;
	
	public Lighting() {
		this.appliance="Lighting";
		this.on=true;
		this.applianceName="Lighting Name";
		this.brightness=30;
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

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	
	
}
