package oop;

public class Rectangle {
	public int l;
	public int w;

	public Rectangle() {
		l = -999;
		w = -999;
	}

	public int getL() {
		return l;
	}

	public int getW() {
		return w;
	}

	public void newLW(int newL, int newW) {
		l = newL;
		w = newW;
	}
}
