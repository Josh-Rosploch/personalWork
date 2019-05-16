package arrays;

import java.util.Random;
import java.util.ArrayList;

public class RectangleFun {
	public static void main(String[] args) {
		Random rng = new Random();
		ArrayList<RectangleClass> rectangle = new ArrayList<RectangleClass>();
		final int RECTANGLES = 20;
		for (int n = 0; n < RECTANGLES; n++) {
			rectangle.add(new RectangleClass(40 + rng.nextInt(100 - 40 + 1), 40 + rng.nextInt(100 - 40 + 1)));
		}
		System.out.println("----------");
		for (int n = 0; n < rectangle.size(); n++) {
			System.out.println("Area of rectangle " + (n + 1) + " is: " + rectangle.get(n).area());
		}
		for (int n = 0; n < rectangle.size(); n++) {
			if (rectangle.get(n).getLength() > 60) {
				rectangle.remove(n);
				n = 0;
			}
		}
		System.out.println("----------");
		for (int n = 0; n < rectangle.size(); n++) {
			System.out.println("Area of rectangle " + (n + 1) + " is: " + rectangle.get(n).area());
		}
	}
}