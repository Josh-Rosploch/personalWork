package inputExamples;

import java.util.Scanner;

public class Monkey {
	public static void main(String[] args) {
		double monkey = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("How tall is an adult monkey in meters?");
		monkey = input.nextDouble();
		System.out.println("The monkey is: " + monkey + " meters tall.");
		input.close();
	}
}