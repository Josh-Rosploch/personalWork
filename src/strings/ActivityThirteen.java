package strings;

import java.util.Scanner;

public class ActivityThirteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your SSN: ");
		String ssn = input.nextLine();
		while (ssn.length() != 9) {
			System.out.println("Error! Please re-enter your SSN:");
			ssn = input.nextLine();
		}
		System.out.println(ssn.substring(5));
		System.out.println(ssn.substring(3, 5));
		System.out.println(ssn.substring(0, 3));
	}
}