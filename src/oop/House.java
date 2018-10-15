package oop;

import java.util.Scanner;

public class House {
	public House() {
	}

	public void getTime() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length and height of the wall?");
		int l = input.nextInt();
		int h = input.nextInt();
		System.out.println("It will take " + (l * h / 200 * 60) + " minutes to paint the wall.");
		input.close();
	}
}
