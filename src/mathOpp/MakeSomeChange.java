package mathOpp;

import java.util.Scanner;

public class MakeSomeChange {
	public static void main(String[] args) {
		double change = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the price of change?");
		change = input.nextDouble();
		input.close();
		System.out.println((int) (change / 1) + " dollar bills.");
		change = change % 1.0;
		System.out.println((int) (change / 0.25) + " quarters.");
		change = change % 0.25;
		System.out.println((int) (change / 0.1) + " dimes.");
		change = change % 0.1;
		System.out.println((int) (change / 0.05) + " nickles.");
		change = change % 0.05;
		System.out.println((int) (change / 0.01) + " pennies.");
	}
}