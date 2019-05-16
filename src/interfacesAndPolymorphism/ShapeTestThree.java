package interfacesAndPolymorphism;

import java.util.ArrayList;

public class ShapeTestThree {
	public static void main(String[] args) {
		ArrayList<Shape> bob = new ArrayList<Shape>();
		bob.add(new Rectangle(1, 2));
		bob.add(new Circle(3));
		bob.add(new Rectangle(4, 5));
		bob.add(new Circle(6));
		bob.add(new Rectangle(7, 8));
		bob.add(new Circle(9));
		double area = 0;
		double sPerimeter = Integer.MAX_VALUE;
		for (int n = 0; n < bob.size(); n++) {
			area += bob.get(n).area();
			if (bob.get(n).perimeter() < sPerimeter) {
				sPerimeter = bob.get(n).perimeter();
			}
		}
		System.out.println("Sum of the areas: " + area);
		System.out.println("Smallest perimeter: " + sPerimeter);
	}
}