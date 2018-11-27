package arrays;

import java.util.Scanner;

public class FriendNameEndsWith {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[25];
		for (int n = 0; n < names.length; n++) {
			System.out.println("Enter the name of friend " + (n + 1) + ".");
			names[n] = input.nextLine();
		}
		System.out.println("Enter a letter.");
		String letr = input.next();
		for (int n = 0; n < names.length; n++) {
			if (names[n].endsWith(letr.substring(0, 1))) {
				System.out.println(names[n] + " ends with " + letr.substring(0, 1));
			}
		}
		input.close();
	}
}