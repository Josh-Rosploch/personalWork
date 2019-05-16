package strings;

import java.util.Scanner;

public class ActivityThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word one:");
		String wordOne = input.next();
		System.out.println("Enter word two:");
		String wordTwo = input.next();
		if (wordOne.compareTo(wordTwo) < 0) {
			System.out.println(wordOne + " comes before " + wordTwo);
		} else {
			System.out.println(wordTwo + " comes before " + wordOne);
		}
		input.close();
	}
}