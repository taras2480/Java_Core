package ua.lviv.lgs.cars;

public class Handlebar {

	private double diameter;
	private String madeIn;

	public Handlebar(double diameter, String madeIn) {
		super();
		this.diameter = diameter;
		this.madeIn = madeIn;
	}

	public void changeDiameter(double desiredDiameter) {
		this.diameter = desiredDiameter;

	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	@Override
	public String toString() {
		return "Handlebar [diameter=" + diameter + ", madeIn=" + madeIn + "]";
	}

}
