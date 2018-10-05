package oop;

public class NumbersTest {

	public static void main(String[] args) {
		Numbers bob = new Numbers();
		bob.sayNumber(7.5);
		bob.sayNumberPlus2(7.5);
		bob.saySum(10.7, 5.3);
		int square = bob.returnSquare(5);
		System.out.println(square);
		int area = bob.returnArea(5, 10);
		System.out.println(area);
		int round = bob.roundUp(6.12421556432);
		System.out.println(round);
	}
}