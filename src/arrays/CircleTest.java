package arrays;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int numCircles = 83;
		CircleClass[] holes = new CircleClass[numCircles];
		for (int j = 0; j < holes.length; j++) {
			System.out.println("Hole Radius:");
			double rad = input.nextDouble();
			holes[j] = new CircleClass(rad);
		}

	}
}