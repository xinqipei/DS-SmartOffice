package Models;

public class Radiators {
	private String item, itemName;
	private boolean on;
	private int temperature;
	
	
	public Radiators() {
		this.item="Radiators";
		this.on=true;
		this.itemName="Radiators Name";
		this.temperature=35;
		
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

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}


	
}
