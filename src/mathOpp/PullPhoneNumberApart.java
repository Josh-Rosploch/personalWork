package mathOpp;

import java.util.Scanner;

public class PullPhoneNumberApart {
	public static void main(String[] args) {
		int phonenum = -999;
		int first = -999;
		int second = -999;
		int third = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your phone number?");
		phonenum = input.nextInt();
		first = (phonenum / 10000000);
		second = (phonenum / 10000) % 1000;
		third = (phonenum % 10000);
		input.close();
		System.out.println("Your phone number is: (" + first + ")" + second + "-" + third + "\nThe area code is: " + first
				+ "\nThe middle three digits are: " + second + "\nThe last four digits are: "
				+ third);
	}
}
