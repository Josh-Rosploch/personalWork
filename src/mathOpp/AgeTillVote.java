package mathOpp;

import java.util.Scanner;

public class AgeTillVote {
	public static void main(String[] args) {
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = 18- input.nextInt();
		System.out.println("You can vote in " + age + " years.");
		input.close();
	}
}