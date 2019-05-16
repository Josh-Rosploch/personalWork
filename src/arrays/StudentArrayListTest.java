package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		for (int n = 0; n < 5; n++) {
			System.out.println("Enter a student name:");
			student.add(input.nextLine());
			;
		}
		if (student.size() > 0) {
			student.remove(0);
		}
		if (student.size() > 0) {
			student.remove(student.size() - 1);
		}
		for (int n = 0; n < student.size(); n++) {
			System.out.println("Student " + (n + 1) + ": " + student.get(n));
		}
		input.close();
	}
}