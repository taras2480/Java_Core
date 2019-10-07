package ua.lviv.lgs.hw;

public class Rectangle {

	private int oneside;
	private int secondside;

	Rectangle() {

		System.out.println(
				"Thinking this program you can determine the area and perimeter of the rectangle using its two sides");

	}

	Rectangle(int oneside, int secondside) {
		this.oneside = oneside;
		this.secondside = secondside;
		System.out.println("Rectangle have next sides = " + oneside + " and " + secondside);
		System.out.println("Area of the rectangleà = " + oneside * secondside);
		System.out.println("Perimeter of the rectangle = " + (oneside + secondside) * 2);
	}

}
