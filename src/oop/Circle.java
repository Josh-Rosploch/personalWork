package oop;

public class Circle {
	public double radius;

	public Circle() {
		radius = -999.0;
	}

	public double returnRadius() {
		return radius;
	}

	public void changeRadius(double newRadius) {
		radius = newRadius;
	}

	public double circumference() {
		return (2 * Math.PI * radius);
	}

	public double area() {
		return (Math.PI * radius * radius);
	}
}
