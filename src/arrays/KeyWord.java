package arrays;

import java.util.Scanner;

public class KeyWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a keyword:");
		String keyWord = input.nextLine();
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int match = 0;
		for (int n = 0; n < words.length; n++) {
			if (words[n].equals(keyWord)) {
				match++;
			}
		}
		System.out.println(match);
		input.close();
	}
}