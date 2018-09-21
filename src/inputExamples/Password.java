package inputExamples;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		int pass1 = -9;
		int pass2 = -9;
		int pass3 = -9;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three one-digit integers:");
		pass1 = input.nextInt();
		pass2 = input.nextInt();
		pass3 = input.nextInt();
		input.close();
		System.out.println("Generated passwords:");
		System.out.println("Password 1: " + pass1 + pass2 + pass3);
		System.out.println("Password 2: " + pass1 + pass3 + pass2);
		System.out.println("Password 3: " + pass2 + pass1 + pass3);
		System.out.println("Password 4: " + pass2 + pass3 + pass1);
		System.out.println("Password 5: " + pass3 + pass1 + pass2);
		System.out.println("Password 6: " + pass3 + pass2 + pass1);
	}
}