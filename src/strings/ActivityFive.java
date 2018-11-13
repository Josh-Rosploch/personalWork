package strings;

import java.util.Scanner;

public class ActivityFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		System.out.println("The of the sentence is: " + sentence.length());
		input.close();
	}
}