package strings;

import java.util.Scanner;

public class ActivityFourteenA {
	private String name;
	private String text;

	public ActivityFourteenA() {
		name = "Name";
		text = "Text";
	}

	public void setName() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the author's name?");
		name = input.nextLine();
		input.close();
	}

	public void setText() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the text in the book?");
		text = input.nextLine();
		input.close();
	}

	public String returnLastNameCapital() {
		String lastName = name.substring(name.indexOf(' ') + 1);
		return lastName.toUpperCase();
	}

	public int charInFirstName() {
		String firstName = name.substring(0, name.indexOf(' '));
		return firstName.length();
	}

	public boolean firstNameHasX() {
		String firstName = name.substring(0, name.indexOf(' '));
		return firstName.toLowerCase().contains("x");
	}

	public int wordsInText() {
		int words;
		if (text.isEmpty()) {
			words = 0;
		} else {
			words = 1;
		}
		for (int j = 0; j < text.length(); j++) {
			if (text.charAt(j) == ' ') {
				words++;
			}
		}
		return words;
	}

}
