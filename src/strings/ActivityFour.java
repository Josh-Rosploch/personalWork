package strings;

import java.util.Scanner;

public class ActivityFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		System.out
				.println("The index where the first letter \"X\" appears in the sentence is: " + sentence.indexOf('X'));
		input.close();
	}
}