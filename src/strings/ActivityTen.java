package strings;

import java.util.Scanner;

public class ActivityTen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your username:");
		String password = input.next();
		System.out.println("Enter your password:");
		password = input.next();
		System.out.println("Re-enter your password:");
		String rePassword = input.next();
		while (!password.equals(rePassword)) {
			System.out.println("Passwords did not match");
			System.out.println("Enter your password:");
			password = input.next();
			System.out.println("Re-enter your password:");
			rePassword = input.next();
		}
		System.out.println("Success");
		input.close();
	}
}