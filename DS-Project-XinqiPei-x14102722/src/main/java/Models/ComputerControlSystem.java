package Models;

public class ComputerControlSystem {
	private String item, itemName;
	private boolean on;
	private int distance;
	
	public ComputerControlSystem() {
		this.item = "ComputerControlSystem";
		this.on = true;
		this.itemName = "ComputerControlSystem Name";
		this.distance = 100;
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

	public int getdistance() {
		return distance;
	}

	public void setdistance(int distance) {
		this.distance = distance;
	}
	
}
