package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		for (int n = 0; n < 3; n++) {
			System.out.println("Enter a name:");
			if (n < 2) {
				names.add(input.nextLine());
			} else {
				names.add(0, input.nextLine());
			}
		}
		for (int n = 0; n < names.size(); n++) {
			System.out.println(names.get(n));
		}
		for (int n = 0; n < 3; n++) {
			System.out.println("Enter a name:");
			names.add(input.nextLine());
		}
		for (int n = 0; n < names.size(); n++) {
			System.out.println(names.get(n));
		}
		input.close();
	}
}