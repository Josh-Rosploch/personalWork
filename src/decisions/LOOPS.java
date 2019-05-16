package decisions;

import java.util.Scanner;

public class LOOPS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int countTo = input.nextInt();
		int count = 0;
		int number = 0;
		while (number <= countTo) {
			number += count;
			count += 2;
		}
		System.out.println(count);
		input.close();
	}
}