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
	}

	public void areaWithDoor() {
		Scanner inputtwo = new Scanner(System.in);
		System.out.println("What is the length and width of the wall?");
		int l = inputtwo.nextInt();
		int w = inputtwo.nextInt();
		System.out.println("What is the length and width of the door?");
		int dl = inputtwo.nextInt();
		int dw = inputtwo.nextInt();
		System.out.println("The area of the wall is " + (l * w - dl * dw) + " feet squared.");
	}
}
