package arrays;

import java.util.Random;

public class ArrayOfFriends {
	public static void main(String[] args) {
		final int col = 5;
		final int row = 8;
		Random rng = new Random();
		FriendClass[][] friends = new FriendClass[row][col];
		for (int nRow = 0; nRow < friends.length; nRow++) {
			for (int nCol = 0; nCol < friends[0].length; nCol++) {
				friends[nRow][nCol] = new FriendClass("name", rng.nextInt(101));
			}
		}
		for (int nRow = 0; nRow < friends.length; nRow++) {
			for (int nCol = 0; nCol < friends[0].length; nCol++) {
				System.out.print(friends[nRow][nCol].getAge() + "\t");
			}
			System.out.println();
		}
	}
} 