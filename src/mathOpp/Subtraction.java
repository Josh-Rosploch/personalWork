package mathOpp;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		int firstnum = -999;
		int secondnum = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first number of the equation?");
		firstnum = input.nextInt();
		System.out.println("What is the second number of the equation?");
		secondnum = input.nextInt();
		System.out.println("The answer is: " + (firstnum - secondnum));
	}
}
