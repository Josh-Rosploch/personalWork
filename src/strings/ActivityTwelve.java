package strings;

import java.util.Scanner;

public class ActivityTwelve {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		for (int numb = 0; numb < sentence.length(); numb++) {
			if (sentence.charAt(numb) != ' ' && sentence.charAt(numb) != 'a' && sentence.charAt(numb) != 'A') {
				System.out.print(sentence.charAt(numb));
			}
		}
	}
}