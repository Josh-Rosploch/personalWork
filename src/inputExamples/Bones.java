package inputExamples;

import java.util.Scanner;

public class Bones {
	public static void main(String[] args) {
		int bones = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How many bones have you broke in your life?");
		bones = input.nextInt();
		System.out.println("You broke " + bones + " bones in your life.");
		input.close();
	}
}