package Models;

public class Lighting {
	private String item, itemName;
	private boolean on;
	private int brightness;
	
	public Lighting() {
		this.item="Lighting";
		this.on=true;
		this.itemName="Lighting Name";
		this.brightness=30;
	}

	public String getitem() {
		return item;
	}

	public void setitem(String item) {
		this.item = item;
	}

	public String getitemName() {
		return itemName;
	}

	public void setitemName(String itemName) {
		this.itemName = itemName;
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
