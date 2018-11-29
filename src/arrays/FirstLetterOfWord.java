package arrays;

import java.util.Scanner;

public class FirstLetterOfWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		for (int n = 0; n < words.length; n++) {
			System.out.println(words[n].charAt(0));
		}
		input.close();
	}
}