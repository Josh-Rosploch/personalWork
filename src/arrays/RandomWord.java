package arrays;

import java.util.Scanner;
import java.util.Random;

public class RandomWord {
	public static void main(String[] args) {
		Random rng = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		System.out.println(words[rng.nextInt(words.length)]);
		input.close();
	}
}