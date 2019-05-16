package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RollADiev2 {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		System.out.println("How many rolls?");
		int rolls = input.nextInt();
		if (rolls < 0) {
			rolls = 1;
		}
		while (rolls != 0) {
			int numb = (1 + generator.nextInt(6 - 1 + 1));
			rolls--;
			switch (numb) {
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			}
		}
		System.out.println("One was rolled " + one + " times." + "\nTwo was rolled " + two + " times."
				+ "\nThree was rolled " + three + " times." + "\nFour was rolled " + four + " times."
				+ "\nFive was rolled " + five + " times." + "\nSix was rolled " + six + " times.");
		input.close();
	}
}