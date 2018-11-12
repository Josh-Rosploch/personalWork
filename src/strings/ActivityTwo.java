package strings;

import java.util.Scanner;

public class ActivityTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		System.out.println("It is " + sentence.contains("Bob") + " that 'Bob' is in the sentence.");
		System.out.println("The sentence is: " + sentence);
		input.close();
	}
}