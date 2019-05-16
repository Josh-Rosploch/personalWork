package arrays;

import java.util.Scanner;

public class ForEachLoopStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are there?");
		int[] students = new int[input.nextInt()];
		for (int n = 0; n < students.length; n++) {
			System.out.println("What is the age of student " + (n + 1) + "?");
			students[n] = input.nextInt();
		}
		int aAge = 0;
		for (int n : students) {
			aAge += n;
		}
		System.out.println("The average age is: " + (double) (aAge) / students.length + ".");
		input.close();
	}
}