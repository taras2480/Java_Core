package ua.lviv.lgs.cars;

public class Cab {
	
	private String type;
	private double length;
	private double width;
	public Cab(String type, double length, double width) {
		super();
		this.type = type;
		this.length = length;
		this.width = width;
	}
	
	public void changeLength (double DesireLength) {
		this.length=DesireLength;
		
		}
	
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Cab [type=" + type + ", length=" + length + ", width=" + width + "]";
	}
	
	
	
	
	
	
	
	
	

}
