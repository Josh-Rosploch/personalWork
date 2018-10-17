package decisions;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is score number one?");
		double scoreOne = input.nextDouble();
		System.out.println("What is score number two?");
		double scoreTwo = input.nextDouble();
		if (scoreOne > scoreTwo) {
			System.out.println("Great job!");
		} else {
			System.out.println("Wrong order!");
		}
		input.close();
	}
}