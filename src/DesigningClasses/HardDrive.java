package DesigningClasses;

import java.util.ArrayList;

public class HardDrive {
	private String name;
	private ArrayList<Double> file = new ArrayList<Double>();
	private double capacity;
	private double space;

	public HardDrive() {
		capacity = -999;
		space = -999;
	}

	public HardDrive(String xName, double xCapacity) {
		name = xName;
		capacity = xCapacity;
		space = xCapacity;
	}

	public void addFile(double xFile) {
		if (space - xFile > 0) {
			file.add(xFile);
			space -= xFile;
		} else {
			System.out.println("Not enough of space!");
		}
	}

	public void deleteFile(int xFileNum) {
		if (xFileNum > 0 && xFileNum < file.size()) {
			file.remove(xFileNum - 1);
		} else {
			System.out.println("File not found!");
		}
	}

	public void isFull() {
		if (space == 0) {
			System.out.println("The harddrive is full.");
		} else {
			System.out.println("The hard drive is not full and has " + space + " gb left.");
		}
	}

	public void isEmpty() {
		if (space == capacity) {
			System.out.println("The harddrive is empty.");
		} else {
			System.out.println("The hard drive is not empty and has " + space + " gb left.");
		}
	}
	
	public void revesreser(){
		file.reverse();
	}
}
