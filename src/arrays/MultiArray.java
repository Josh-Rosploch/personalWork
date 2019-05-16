package arrays;

public class MultiArray {

	public static void main(String[] args) {
		final int maxRow = 24;
		final int maxCol = 10;

		double[][] test = new double[maxRow][maxCol];

		// Row By Row
		for (int row = 0; row < maxRow; row++) {
			for (int column = 0; column < maxCol; column++) {
				System.out.println(test[row][column]);
			}
		}

		// Column By Column
		for (int row = 0; row < maxRow; row++) {
			for (int column = 0; column < maxCol; column++) {
				System.out.println(test[row][column]);
			}
		}

	}
}