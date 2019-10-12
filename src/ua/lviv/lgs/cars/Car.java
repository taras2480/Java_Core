package ua.lviv.lgs.cars;

public class Car {
	
	private String brand;
	private int qtyDoors;
	private double carMileage;
	private Handlebar handlebar;
	private Wheel wheel;
	private Cab cab;
	
	
		public Car(String brand, int qtyDoors, double carMileage, Handlebar handlebar, Wheel wheel, Cab cab) {
		super();
		this.brand = brand;
		this.qtyDoors = qtyDoors;
		this.carMileage = carMileage;
		this.handlebar = handlebar;
		this.wheel = wheel;
		this.cab = cab;
	

	}
	
	public void changeCarMileage (double DesireCarMileage) {
		this.carMileage=DesireCarMileage;
		
		}
	
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQtyDoors() {
		return qtyDoors;
	}

	public void setQtyDoors(int qtyDoors) {
		this.qtyDoors = qtyDoors;
	}

	public double getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(double carMileage) {
		this.carMileage = carMileage;
	}

	public Handlebar getHandlebar() {
		return handlebar;
	}

	public void setHandlebar(Handlebar handlebar) {
		this.handlebar = handlebar;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", qtyDoors=" + qtyDoors + ", carMileage=" + carMileage + ", handlebar="
				+ handlebar + ", wheel=" + wheel + ", cab=" + cab + "]";
	}

	

	

	
	
	
	
	
	
	
	
	
	

}
