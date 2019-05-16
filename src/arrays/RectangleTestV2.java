package arrays;

import java.util.ArrayList;
import java.util.Random;

public class RectangleTestV2 {
	public static void main(String[] args) {
		ArrayList<RectangleClass> rectangle = new ArrayList<RectangleClass>();
		Random rng = new Random(255);
		final int max = 400;
		for (int n = 0; n < max; n++) {
			rectangle.add(new RectangleClass((50 + rng.nextInt(70 - 50 + 1)), (50 + rng.nextInt(70 - 50 + 1))));
		}
		if (rectangle.size() > 0) {
			RectangleClass removedBox = rectangle.remove(rng.nextInt(rectangle.size()));
			System.out.println("Removed rectangle length: " + removedBox.getLength());
		}
		for (int n = rectangle.size() - 1; n >= 0; n--) {
			System.out.println("Area of rectangle " + (n + 1) + " is: " + rectangle.get(n).area());
		}
	}
}