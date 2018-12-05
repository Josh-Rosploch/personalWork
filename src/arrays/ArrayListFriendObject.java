package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFriendObject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<FriendClass> friends = new ArrayList<FriendClass>();
		for (int n = 0; n < 3; n++) {
			System.out.println("Enter a name and age:");
			friends.add(0, new FriendClass(input.nextLine(), input.nextInt()));
			input.nextLine();
		}
		for (int n = 0; n < friends.size(); n++) {
			System.out.println(friends.get(n).getName());
		}
		input.close();
	}
}