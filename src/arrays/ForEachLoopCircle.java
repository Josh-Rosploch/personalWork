package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ForEachLoopCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<CircleClass> circles = new ArrayList<CircleClass>();
		System.out.println("How many circles are there?");
		int circlesNum = input.nextInt();
		for (int n = 0; n < circlesNum; n++) {
			System.out.println("What is the radii of circle " + (n + 1) + "?");
			circles.add(new CircleClass(input.nextDouble()));
		}
		for (CircleClass n : circles) {
			System.out.println("Area of circle: " + n.area());
		}
		input.close();
	}
}