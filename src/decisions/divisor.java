package decisions;

import java.util.Scanner;

public class divisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = input.nextInt();
		System.out.print("Divisors for " + n + ":      ");
		// div = Divisor Test
		for (int div = 1; div <= n; div++) {
			if (n % div == 0) {
				System.out.print((n / div) + "      ");
			}
		}
		input.close();
	}
}