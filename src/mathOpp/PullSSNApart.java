package mathOpp;

import java.util.Scanner;

public class PullSSNApart {
	public static void main(String[] args) {
		int age = -999;
		int ssn= -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your ssn? (No dashes!)");
		ssn = input.nextInt();
		input.close();
		System.out.println("Your age is: " + age
				+ "\nYou will turn 18 in " + (18-age) + " years."
				+ "\nYour SSN is: " + ssn
				+ "\nThe last four digits of your SSN is: " + (ssn%10000));
	}
}