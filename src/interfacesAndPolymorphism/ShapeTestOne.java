package interfacesAndPolymorphism;

import java.util.Scanner;

public class ShapeTestOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a width");
		double width = input.nextDouble();
		System.out.println("Enter a length");
		double length = input.nextDouble();
		Shape bob = new Rectangle(width, length);
		System.out.println("Area: " + bob.area());
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Enter a radius");
		double radius = input.nextDouble();
		Shape bil = new Circle(radius);
		System.out.println("Area: " + bil.area());
		System.out.println("Perimeter: " + bil.perimeter());
		input.close();
	}
}