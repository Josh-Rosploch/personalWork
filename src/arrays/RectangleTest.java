package arrays;

import java.util.Scanner;
import java.util.Random;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		final int numRectangles = 100;
		RectangleClass[] rectang = new RectangleClass[numRectangles];
		for (int j = 0; j < rectang.length; j++) {
			rectang[j] = new RectangleClass((10 + rng.nextInt(56 - 10 + 1)), (10 + rng.nextInt(56 - 10 + 1)));
		}
		int bigArea = rectang[0].area();
		int bigIndex = 0;
		for (int j = 0; j < rectang.length; j++) {
			if (rectang[j].area() > bigArea) {
				bigArea = rectang[j].area();
				bigIndex = j;
			}
		}
		RectangleClass zero = new RectangleClass(rectang[0].getLength(), rectang[0].getWidth());
		rectang[0] = rectang[bigIndex];
		rectang[bigIndex] = zero;
		for (int j = 0; j < rectang.length; j++) {
			System.out.println("Length of rectangle " + (j + 1) + ":  " + rectang[j].getLength());
			System.out.println("Width of rectangle " + (j + 1) + ":  " + rectang[j].getWidth());
			System.out.println("Area of rectangle " + (j + 1) + ":  " + rectang[j].area());
			System.out.println("------------------------------");
		}
		input.close();
	}
}