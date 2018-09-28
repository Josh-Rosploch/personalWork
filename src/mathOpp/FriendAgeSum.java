package mathOpp;

import java.util.Scanner;

public class FriendAgeSum {

	public static void main(String[] args) {
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Write the age of three friends:");
		age = input.nextInt();
		age = age + input.nextInt();
		age = age + input.nextInt();
		System.out.println("The sum of the three ages is: " + age + ".");
		input.close();
	}
}