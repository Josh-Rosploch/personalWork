package oop;

public class Numbers {
	public Numbers() {
	}

	public void sayNumber(double num) {
		System.out.println("double: " + num);
	}

	public void sayNumberPlus2(double num) {
		System.out.println("double: " + (num + 2));
	}

	public void saySum(double num1, double num2) {
		System.out.println("double: " + (num1 + num2));
	}

	public int returnSquare(int num1) {
		return num1 * num1;
	}

	public int returnArea(int l, int w) {
		return l * w;
	}

	public int roundUp(double n) {
		return (int) Math.ceil(n);
	}
}
