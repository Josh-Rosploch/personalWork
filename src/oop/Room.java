package oop;

import java.util.Scanner;

public class Room {

	public Room() {
	}

	public void area() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length and width of the wall?");
		int l = input.nextInt();
		int w = input.nextInt();
		System.out.println("The area of the wall is " + l * w + " feet squared.");
		input.close();
	}

	public void areaWithDoor() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length and width of the wall?");
		int l = input.nextInt();
		int w = input.nextInt();
		System.out.println("What is the length and width of the door?");
		int dl = input.nextInt();
		int dw = input.nextInt();
		System.out.println("The area of the wall is " + (l * w - dl * dw) + " feet squared.");
		input.close();
	}
}