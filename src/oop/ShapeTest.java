package oop;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle shapeOne = new Rectangle();
		Circle shapeTwo = new Circle();
		RightTriangle shapeThree = new RightTriangle();
		Trapezoid shapeFour = new Trapezoid();
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length and width of the rectangle?");
		shapeOne.setLength(input.nextDouble());
		shapeOne.setWidth(input.nextDouble());
		System.out.println(shapeOne.area());
		System.out.println(shapeOne.perimeter());
		System.out.println("What is the radius of the circle?");
		shapeTwo.setRadius(input.nextDouble());
		System.out.println(shapeTwo.area());
		System.out.println(shapeTwo.circumference());
		System.out.println("What is the base and height of the right triangle?");
		shapeThree.setBase(input.nextDouble());
		shapeThree.setHeight(input.nextDouble());
		System.out.println(shapeThree.area());
		System.out.println(shapeThree.perimeter());
		System.out.println("What is the base one, base two, leg, and height of the isosceles trapezoid?");
		shapeFour.setBase1(input.nextDouble());
		shapeFour.setBase2(input.nextDouble());
		shapeFour.setLeg(input.nextDouble());
		shapeFour.setHeight(input.nextDouble());
		System.out.println(shapeFour.area());
		System.out.println(shapeFour.perimeter());
		input.close();
	}
}