package inputExamples;

import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		int weight = -999;
		int age = -999;
		int number = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight:");
		weight = input.nextInt();
		System.out.println("Enter your age:");
		age = input.nextInt();
		System.out.println("Enter your lucky number:");
		number = input.nextInt();
		input.close();
		System.out.println("I see...\n" + number + " year from now...\nYou will be reside number " + age + weight
				+ "\nat the old folks home.");
	}
}