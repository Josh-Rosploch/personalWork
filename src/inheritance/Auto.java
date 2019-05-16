package inheritance;

public class Auto {
	private double odometer;
	private double mPG;

	public Auto() {
		odometer = 0.0;
		mPG = 30.0;
	}

	public Auto(double xOdometer, double xMPG) {
		odometer = xOdometer;
		mPG = xMPG;
	}

	public double getOdometer() {
		return odometer;
	}

	public double getMPG() {
		return mPG;
	}

	public void drive(double xDrive) {
		odometer += xDrive;
	}

	public String toString() {
		return ("Auto: Odometer = " + odometer + ", MPG = " + mPG);
	}
}