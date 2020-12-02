package fileHandlingProject;

import java.io.Serializable;

public class Car implements Serializable{

	private String color;
	private int seatCount;
	private int tankSizeGals;
	
	
	
	public Car(String color, int seatCount, int tankSizeGals) {
		super();
		this.color = color;
		this.seatCount = seatCount;
		this.tankSizeGals = tankSizeGals;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public int getTankSizeGals() {
		return tankSizeGals;
	}
	public void setTankSizeGals(int tankSizeGals) {
		this.tankSizeGals = tankSizeGals;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", seatCount=" + seatCount + ", tankSizeGals=" + tankSizeGals + "]";
	}
	
	
}
