package mathOpp;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Double r = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the circle?");
		r = input.nextDouble();
		r = 3.14159265359 * r * r;
		System.out.println("The area of the circle is: " + r);
		input.close();
	}
}