package ua.lviv.lgs.hw_circle;

public class Circle {
	private int radius;
	private int diameter;

	Circle() {
		System.out.println(
				"Thinking this program you can determine the area and circuit of the circle using its radius and diameter");

	}

	Circle(int radius, int diameter) {
		this.radius = radius;
		this.diameter = diameter;
		diameter = 2 * radius;
		System.out.println("The circle have radius=" + radius + " and diameter=" + diameter);
		System.out.println("The area circle=" + Math.PI * (diameter * diameter) / 4);
		System.out.println("The circuit circle=" + Math.PI * 2 * radius);

	}

}