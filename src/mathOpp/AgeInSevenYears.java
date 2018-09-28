package mathOpp;

import java.util.Scanner;

public class AgeInSevenYears {
	public static void main(String[] args) {
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt() + 7;
		System.out.println("Your age in seven years is: " + age);
		input.close();
	}
}