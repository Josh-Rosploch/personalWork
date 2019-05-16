package oop;

public class RightTriangle {
	public double base;
	public double height;

	public RightTriangle() {
		base = -999.0;
		height = -999.0;
	}

	public double returnBase() {
		return base;
	}

	public void setBase(double newBase) {
		base = newBase;
	}

	public double returnHeight() {
		return height;
	}

	public void setHeight(double newHeight) {
		height = newHeight;
	}

	public double hypot() {
		return Math.sqrt(base * base + height * height);
	}

	public double perimeter() {
		return hypot() + base + height;
	}

	public double area() {
		return (base * height / 2);
	}
}
