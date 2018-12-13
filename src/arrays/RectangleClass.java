package arrays;

public class RectangleClass {
	private int length;
	private int width;

	public RectangleClass() {
		length = 10;
		width = 10;
	}

	public RectangleClass(int xLength, int xWidth) {
		length = xLength;
		width = xWidth;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int xLength) {
		length = xLength;
	}

	public void setWidth(int xWidth) {
		width = xWidth;
	}

	public int perimeter() {
		return length * 2 + width * 2;
	}

	public int area() {
		return length * width;
	}
}
