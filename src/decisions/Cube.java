package decisions;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number (-1 to exit)");
		for (int n = input.nextInt(); n != -1; n = input.nextInt()) {
			System.out.println(n + " cubed is " + (n * n * n) + "\nEnter a number (-1 to exit)");
		}
		input.close();
	}
}