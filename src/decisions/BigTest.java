package decisions;

import java.util.Scanner;

public class BigTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		double numOne = input.nextDouble();
		double numTwo = input.nextDouble();
		double numThree = input.nextDouble();
		if (numOne < numTwo) {
			numOne = numTwo;
		}
		if (numOne < numThree) {
			numOne = numThree;
		}
		System.out.println("----------\n" + numOne);
		input.close();
	}
}