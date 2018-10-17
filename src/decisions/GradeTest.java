package decisions;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three test scores:");
		double scoreOne = input.nextDouble();
		double scoreTwo = input.nextDouble();
		double scoreThree = input.nextDouble();
		double averageScore = ((scoreOne + scoreTwo + scoreThree) / 3);
		System.out.println("Did you do the extra credit? True or False");
		boolean extra = input.nextBoolean();
		if (extra == true) {
			System.out.println("How many points did you earn?");
			averageScore += input.nextDouble();
		}
		System.out.println("Your average score is: " + averageScore);
		input.close();
	}
}