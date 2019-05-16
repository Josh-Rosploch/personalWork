package mathOpp;

import java.util.Scanner;

public class LetsPaint {
	public static void main(String[] args) {
		double length = -999.0;
		double width = -999.0;
		double area = -999.0;
		final double HEIGHT = 8;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the legth and width of the room? (In feet)");
		length = input.nextDouble();
		width = input.nextDouble();
		area = (width+length)*2*HEIGHT;
		input.close();
		System.out.println("The length of the room is " + length 
				+ " feet.\nThe width of the room is " + width
				+ " feet.\nThe height of the room is " + HEIGHT
				+ " feet.\nThe area of wall space that will be painted is " + area
				+ " square feet.\nThe number of gallons of paint needed to paint the room is " + (area/150.0) + " gallons.");
	}
}