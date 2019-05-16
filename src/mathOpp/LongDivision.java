package mathOpp;

import java.util.Scanner;

public class LongDivision {

	public static void main(String[] args) {
		int dividend = -999;
		int divisor = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the divisor?");
		divisor = input.nextInt();
		input.close();
		System.out.println((dividend / divisor) + "r" + (dividend % divisor));
	}
}