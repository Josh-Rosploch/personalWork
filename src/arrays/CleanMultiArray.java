package arrays;

import java.util.Scanner;

public class CleanMultiArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of rows?");
		int maxRow = input.nextInt();
		System.out.println("Number of columns?");
		int maxCol = input.nextInt();

		double[][] test = new double[maxRow][maxCol];

		for (int col = 0; col < test[0].length; col++) {
			for (int row = 0; row < test.length; row++) {
				// stuff
			}
		}
		input.close();
	}
}