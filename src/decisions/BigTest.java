package decisions;

import java.util.Scanner;

public class BigTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		double numOne = input.nextDouble();
		double numTwo = input.nextDouble();
		double numThree = input.nextDouble();
		if (numOne > numTwo && numOne > numThree) {
			System.out.println(numOne);
		}
		if (numTwo > numOne && numTwo > numThree) {
			System.out.println(numTwo);
		}
		if (numThree > numTwo && numThree > numOne) {
			System.out.println(numThree);
		}
		input.close();
	}
}