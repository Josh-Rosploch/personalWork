package arrays;

import java.util.Scanner;
import java.util.Random;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		final int numRectangles = 100;
		RectangleClass[] holes = new RectangleClass[numRectangles];
		for (int j = 0; j < holes.length; j++) {
			holes[j] = new RectangleClass((10 + rng.nextInt(56 - 10 + 1)), (10 + rng.nextInt(56 - 10 + 1)));
		}
		for (int j = 0; j < holes.length; j++) {
			System.out.println("Length of rectangle " + (j + 1) + ":  " + holes[j].getLength());
			System.out.println("Width of rectangle " + (j + 1) + ":  " + holes[j].getWidth());
			System.out.println("Area of rectangle " + (j + 1) + ":  " + holes[j].area());
			System.out.println("------------------------------");
		}
	}
}