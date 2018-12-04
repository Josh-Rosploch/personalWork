package arrays;

import java.util.Random;

public class MoreThan2D {

	public static void main(String[] args) {
		Random rng = new Random(1);
		final int maxRow = 3;
		final int maxCol = 7;
		final int maxThreeD = 9;
		double[][][] test = new double[maxThreeD][maxRow][maxCol];
		for (int threeD = 0; threeD < test.length; threeD++) {
			for (int row = 0; row < test[0].length; row++) {
				for (int col = 0; col < test[0][0].length; col++) {
					test[threeD][row][col] = (rng.nextInt(51));
				}
			}
		}
		int totalTotal = 0;
		for (int threeD = 0; threeD < test.length; threeD++) {
			double total = 0;
			for (int row = 0; row < test[0].length; row++) {
				for (int col = 0; col < test[0][0].length; col++) {
					total += test[threeD][row][col];
				}
			}
			System.out.println("Total for 3D " + (threeD + 1) + ": " + total);
			totalTotal += total;
		}
		System.out.println("Total: " + totalTotal);
	}
}