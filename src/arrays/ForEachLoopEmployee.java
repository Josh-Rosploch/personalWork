package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ForEachLoopEmployee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> employees = new ArrayList<Double>();
		System.out.println("How many employees are there?");
		int employeeLength = input.nextInt();
		for (int n = 0; n < employeeLength; n++) {
			System.out.println("What is the wage of employee " + (n + 1) + "?");
			employees.add(input.nextDouble());
		}
		double highestWage = 0;
		for (double n : employees) {
			if (n > highestWage) {
				highestWage = n;
			}
		}
		System.out.println("Highest wage is: " + highestWage);
		input.close();
	}
}