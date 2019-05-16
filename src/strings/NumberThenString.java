package strings;

import java.util.Scanner;

public class NumberThenString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("What is your full name?");
		input.nextLine();
		String name = input.nextLine();
		System.out.println("Your age is: " + age);
		System.out.println("Your name is: " + name);
		input.close();
	}
}