package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Jane");
		names.add(1, "Billy");
		System.out.println("Enter your name:");
		names.add(input.nextLine());
		for (int n = 0; n < names.size(); n++) {
			System.out.println(names.get(n));
		}
		input.close();
	}
}