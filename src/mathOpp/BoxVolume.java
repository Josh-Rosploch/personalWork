package mathOpp;

import java.util.Scanner;

public class BoxVolume {
	public static void main(String[] args) {
		int box = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the box dimentions:");
		box = input.nextInt();
		box = box * input.nextInt();
		box = box * input.nextInt();
		System.out.println("The volume of the box is: " + box + " feet cubed.");
		input.close();
	}
}