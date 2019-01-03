package DesigningClasses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import arrays.RectangleClass;

public class RectangleSequentialSearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		ArrayList<RectangleClass> score = new ArrayList<RectangleClass>();
		for (int n = 0; n < 100; n++) {
			score.add(new RectangleClass(rng.nextInt(500), rng.nextInt(500)));
		}
		System.out.println("Enter a number:");
		int testScore = input.nextInt();
		int inThere = 0;
		System.out.println(score.size());
		for (int n = 0; n < score.size(); n++) {
			System.out.println(score.get(n).getWidth());
			if (score.get(n).getWidth() == testScore) {
				inThere++;
			}
		}
		System.out.println("The number of rectangles with the width of " + testScore + " is: " + inThere);
		input.close();
	}
}