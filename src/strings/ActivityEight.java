package strings;

import java.util.Scanner;

public class ActivityEight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two names: ");
		String nameOne = input.nextLine();
		String nameTwo = input.nextLine();
		if (nameOne.compareToIgnoreCase(nameTwo) < 0) {
			System.out.println(nameOne.toUpperCase());
		} else {
			System.out.println(nameTwo.toUpperCase());
		}
		input.close();
	}
}
