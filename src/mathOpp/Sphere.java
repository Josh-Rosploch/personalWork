package mathOpp;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		Double r = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the sphere?");
		r = input.nextDouble();
		r = 4.0 / 3.0 * Math.PI * r * r * r;
		System.out.println("The volume of the sphere is: " + r);
		input.close();
	}
}