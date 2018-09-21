package inputExamples;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("Your age is " + age);
		input.close();
	}
}