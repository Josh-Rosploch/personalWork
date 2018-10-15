package oop;

import java.util.Scanner;

public class Shingles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the roof?");
		double l = input.nextDouble();
		System.out.println("What is the height of the roof?");
		double h = input.nextDouble();
		double sa = (2 * l * Math.sqrt((l * l / 4) + (h * h)));
		input.close();
		System.out.println("The ammount of shingle bundles needed to roof the house is about: "
				+ Math.round(sa / 22.0 * 100.0) / 100.0);
	}
}
