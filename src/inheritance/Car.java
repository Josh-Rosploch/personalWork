package inheritance;

public class Car extends Auto {
	private int cupHolders;

	public Car(double xOdometer, double xMPG, int xCupHolders) {
		super(xOdometer, xMPG);
		cupHolders = xCupHolders;
	}

	public int getCupHolders() {
		return cupHolders;
	}
}