package strings;

import java.util.Scanner;

public class ActivitySeven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		String lowSentence = sentence.toLowerCase();
		System.out.println(lowSentence);
		System.out.println(sentence);
		input.close();
	}
}
