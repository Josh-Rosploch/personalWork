package oop;

public class Trapezoid {
	public double base1;
	public double base2;
	public double height;
	public double leg;

	public double returnBase1() {
		return base1;
	}

	public void setBase1(double newBase1) {
		base1 = newBase1;
	}

	public double returnBase2() {
		return base2;
	}

	public void setBase2(double newBase2) {
		base2 = newBase2;
	}

	public double returnHeight() {
		return height;
	}

	public void setHeight(double newHeight) {
		height = newHeight;
	}

	public double returnLeg() {
		return leg;
	}

	public void setLeg(double newLeg) {
		leg = newLeg;
	}

	public double perimeter() {
		return (base1 + leg + base2 + leg);
	}

	public double area() {
		return (((base1 + base2) * height) / 2);
	}
}
