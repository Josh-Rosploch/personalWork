package inputExamples;

import java.util.Scanner;

public class Combo {
	public static void main(String[] args) {
		int combo1 = -99;
		int combo2 = -99;
		int combo3 = -99;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number in your lock combo:");
		combo1 = input.nextInt();
		System.out.println("Enter the second number in your lock combo:");
		combo2 = input.nextInt();
		System.out.println("Enter the third number in your lock combo:");
		combo3 = input.nextInt();
		input.close();
		System.out.println("Your combo is: " + combo1 + " - " + combo2 + " - " + combo3);
	}
}