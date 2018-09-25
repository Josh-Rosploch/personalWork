package mathOpp;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		double score1 = -999.0;
		double score2 = -999.0;
		double score3 = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What was the score of three studetns on the test?");
		score1 = input.nextDouble();
		score2 = input.nextDouble();
		score3 = input.nextDouble();
		input.close();
		System.out.println("The score of student one was " + score1 + "%, the score of student two was " + score2
				+ "%, The score of student three was " + score3 + "%, the average score was "
				+ ((score1 + score2 + score3) / 3) + "%.");
	}
}