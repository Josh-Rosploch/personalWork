package DesigningClasses;

import java.util.Scanner;

public class HardDriveTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of the harddrive?");
		String name = input.nextLine();
		System.out.println("What is the size of the harddrive?");
		double size = input.nextDouble();
		HardDrive C = new HardDrive(name, size);
		C.isFull();
		C.isEmpty();
		System.out.println("Enter a file size:");
		C.addFile(input.nextDouble());
		System.out.println("Enter a file size:");
		C.addFile(input.nextDouble());
		System.out.println("Enter a file size:");
		C.addFile(input.nextDouble());
		System.out.println("Enter a file number to remove:");
		C.deleteFile(input.nextInt());
		C.isFull();
		C.isEmpty();
		input.close();
	}
}