package inputExamples;

import java.util.Scanner;

public class AgeAndWeight {
	public static void main(String[] args) {
		int age = -999;
		double weight = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("Your age is " + age);
		System.out.println("What is your weight in pounds?");
		weight = input.nextDouble();
		System.out.println("Your age is " + weight + " pounds.");
		input.close();
	}
}