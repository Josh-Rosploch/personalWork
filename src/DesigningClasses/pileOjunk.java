package DesigningClasses;

import java.util.Random;

public class pileOjunk {
	private static int idNumber;
	private int randomNumber;

	public pileOjunk() {
		Random rng = new Random();
		randomNumber = (10 + rng.nextInt(100 - 10 + 1));
	}

	public pileOjunk(int xIDNumber) {
		idNumber = xIDNumber;
	}

	public int sumOfTwo(int xOne, int xTwo) {
		return (xOne + xTwo);
	}

	public void setRandom(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public int getId() {
		return idNumber;
	}

	public int getNum() {
		return randomNumber;
	}
}