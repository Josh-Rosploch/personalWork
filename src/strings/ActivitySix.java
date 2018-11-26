package strings;

import java.util.Scanner;

public class ActivitySix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		for (int length = 0; length < sentence.length(); length++) {
			System.out.println(sentence.charAt(length));
		}
		input.close();
	}
}