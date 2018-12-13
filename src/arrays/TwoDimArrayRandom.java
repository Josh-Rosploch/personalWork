package arrays;

import java.util.Random;
import java.util.Scanner;

public class TwoDimArrayRandom {
	public static void main(String[] args) {
		Random rng = new Random();
		Scanner input = new Scanner(System.in);
		final int maxRow = 3;
		final int maxCol = 7;
		double[][] test = new double[maxRow][maxCol];
		for (int row = 0; row < test.length; row++) {
			for (int col = 0; col < test[0].length; col++) {
				test[row][col] = (rng.nextInt(101));
			}
		}
		for (int row = 0; row < test.length; row++) {
			for (int col = 0; col < test[0].length; col++) {
				System.out.print(test[row][col] + "\t");
			}
			System.out.println();
		}
		double total = 0;
		for (int row = 0; row < test.length; row++) {
			for (int col = 0; col < test[0].length; col++) {
				total += test[row][col];
			}
		}
		System.out.println("Total: " + total);
		input.close();
	}
}