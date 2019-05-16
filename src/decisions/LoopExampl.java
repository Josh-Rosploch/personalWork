package decisions;

import java.util.Scanner;

public class LoopExampl {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = 0;
		for (int j = 1; j <= 5; j++) {
			System.out.println("Enter a number :");
			k += input.nextInt();
		}
		System.out.println(k + " Hello");
		input.close();
	}
}