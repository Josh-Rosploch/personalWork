package DesigningClasses;

import java.util.Random;

public class Sorting {
	public static void main(String[] args) {
		Random rng = new Random();
		int[] numbers = new int[100];
		boolean inThere = false;
		int j = -999;

		for (j = 0; j < numbers.length; j++)
			numbers[j] = rng.nextInt(500);

		for (j = 0; j < numbers.length && numbers[j] != 36; j++)
			;

		if (j != numbers.length)
			inThere = true;

		System.out.println("Is the number 36 in the array? " + inThere + " " + j);
	}
}