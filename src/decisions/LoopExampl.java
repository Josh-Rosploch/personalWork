package decisions;

import java.util.Scanner;

public class LoopExampl {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		for (int j = 1; j <= 10; j++) {
			System.out.println(k + " Hello");
		}
		input.close();
	}
}