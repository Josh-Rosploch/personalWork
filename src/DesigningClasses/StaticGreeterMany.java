package DesigningClasses;

import java.util.Scanner;

public class StaticGreeterMany {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many greeters?");
		Greeter[] bobs = new Greeter[input.nextInt()];
		for (int n = 0; n < bobs.length; n++) {
			System.out.println("What is the age of greeter " + (n + 1) + "?");
			bobs[n] = new Greeter(input.nextInt());
		}
		for (int n = 0; n < bobs.length; n++) {
			System.out.println("Greeter " + (n + 1) + ":");
			bobs[n].sayAge();
		}
		input.close();
	}
}