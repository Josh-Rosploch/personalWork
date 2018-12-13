package arrays;

import java.util.Scanner;

public class FullName {
	public static void main(String[] args) {
		final int row = 4;
		final int col = 3;
		Scanner input = new Scanner(System.in);
		String[][] names = new String[row][col];
		for (int nRow = 0; nRow < names.length; nRow++) {
			for (int nCol = 0; nCol < names[0].length; nCol++) {
				System.out.println("Enter a name");
				names[nRow][nCol] = input.nextLine();
			}
		}
		for (int nRow = 0; nRow < names.length; nRow++) {
			for (int nCol = 0; nCol < names[0].length; nCol++) {
				System.out.println("Row " + (nRow + 1) + ", Col " + (nCol + 1) + " name is: " + names[nRow][nCol]);
			}
		}
		System.out.println("--------------------");
		for (int nRow = 0; nRow < names.length; nRow++) {
			for (int nCol = 0; nCol < names[0].length; nCol++) {
				System.out.println(
						"Row " + (nRow + 1) + ", Col " + (nCol + 1) + " name length is: " + names[nRow][nCol].length());
			}
		}
		input.close();
	}
}