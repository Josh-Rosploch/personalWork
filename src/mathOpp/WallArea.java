package mathOpp;

import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		int wall = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("The height of the wall is 8 feet, what is the width?");
		wall = input.nextInt() * 8;
		System.out.println("The are of the wall is " + wall + " square feet.");
		input.close();
	}
}