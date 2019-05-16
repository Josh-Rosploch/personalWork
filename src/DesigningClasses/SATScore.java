package DesigningClasses;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SATScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		ArrayList<Integer> score = new ArrayList<Integer>();
		for (int n = 0; n < 1000; n++) {
			score.add((400 + rng.nextInt(1600 - 400 + 1)));
		}
		System.out.println("Enter a number:");
		int testScore = input.nextInt();
		boolean inThere = false;
		for (int n : score) {
			if (n == testScore) {
				inThere = true;
			}
		}
		System.out.println("Is the number " + testScore + " in the array? " + inThere);
		input.close();
	}
}