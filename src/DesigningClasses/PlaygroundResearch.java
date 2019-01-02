package DesigningClasses;

import java.util.Scanner;

public class PlaygroundResearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] holes = new double[10][12];
		double average = 0;
		double tallest = Integer.MIN_VALUE;
		double shortest = Integer.MAX_VALUE;
		for (int r = 0; r < holes.length; r++) {
			for (int c = 0; c < holes[r].length; c++) {
				System.out.println("Enter a height:");
				holes[r][c] = input.nextDouble();
			}
		}
		for (int r = 0; r < holes.length; r++) {
			for (int c = 0; c < holes[r].length; c++) {
				average += holes[r][c];
				if (holes[r][c] > tallest) {
					tallest = holes[r][c];
				}
				if (holes[r][c] < shortest) {
					shortest = holes[r][c];
				}
			}
		}
		average = (average / (holes[0].length * holes.length));
		System.out.println("The overall average height of the students: " + average + "\nThe tallest student: "
				+ tallest + "\nThe shortest student: " + shortest);
		input.close();
	}
}