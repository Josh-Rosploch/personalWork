package inputExamples;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		boolean vote = false;
		Scanner input = new Scanner(System.in);
		System.out.println("True or False: Can you vote?");
		vote = input.nextBoolean();
		System.out.println("It is " + vote + " that you can vote.");
	}
}