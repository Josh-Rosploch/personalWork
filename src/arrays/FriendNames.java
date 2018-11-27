package arrays;

import java.util.Scanner;

public class FriendNames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[25];
		for (int n = 0; n < names.length; n++) {
			System.out.println("Enter the name of friend " + (n + 1) + ".");
			names[n] = input.nextLine();
		}
		for (int n = (names.length - 1); n >= 0; n--) {
			System.out.println("Friend " + (n + 1) + "'s name is: " + names[n]);
		}
		input.close();
	}
}