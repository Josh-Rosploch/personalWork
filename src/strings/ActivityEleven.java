package strings;

import java.util.Scanner;

public class ActivityEleven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		for (int numb = 0; numb < sentence.length(); numb += 4) {
			System.out.println(sentence.charAt(numb));
		}
	}
}