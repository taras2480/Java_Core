package com.lgs.lab.interface2;

import com.lgs.lab.interface1.*;

public class MyCalculator implements Numerable {

	private double a;
	private double b;

	MyCalculator(double a, double b) {

		this.a = a;
		this.b = b;

	}

	@Override
	public void amount() {
		System.out.println("Amount " + a + " and " + b + " is " + (a + b));

	}

	@Override
	public void theDifNum() {
		System.out.println("Subtraction " + a + " and " + b + " is " + (a - b));

	}

	@Override
	public void multNum() {
		System.out.println("Multiplication " + a + " and " + b + " is " + (a * b));

	}

	@Override
	public void devNum() {
		System.out.println("Division " + a + " and " + b + " is " + (a / b));

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "MyCalculator [a=" + a + ", b=" + b + "]";
	}

}
