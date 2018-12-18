package DesigningClasses;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		int[] num = new int[100];
		for (int n = 0; n < num.length; n++) {
			num[n] = rng.nextInt(500);
		}
		System.out.println("Enter a number:");
		int testScore = input.nextInt();
		int inThere = 0;
		for (int n : num) {
			if (n == testScore) {
				inThere++;
			}
		}
		System.out.println("The number " + testScore + " is in the array " + inThere + " time(s).");
		input.close();
	}
}