package decisions;

public class SquareClass {
	private double side;

	public SquareClass() {
		side = 10;
	}

	public SquareClass(double newSide) {
		// newSide must be a positive number or else it will be set to 10
		if (newSide > 0) {
			side = newSide;
		} else {
			side = 10;
		}
	}

	public double getArea() {
		return (side * side);
	}
}