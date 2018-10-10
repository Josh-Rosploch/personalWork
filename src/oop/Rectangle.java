package oop;

public class Rectangle {
	public double length;
	public double width;

	public Rectangle() {
		length = -999.0;
		width = -999.0;
	}

	public double returnLength() {
		return length;
	}

	public double returnWidth() {
		return width;
	}

	public void newLength(double newLength) {
		length = newLength;
	}

	public void newWidth(double newWidth) {
		width = newWidth;
	}

	public double perimeter() {
		return ((length + width) * 2.0);
	}

	public double area() {
		return (length * width);
	}
}