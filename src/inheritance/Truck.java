package inheritance;

public class Truck extends Auto {
	private boolean fourWD;

	public Truck(double xOdometer, double xMPG, boolean xFourWD) {
		super(xOdometer, xMPG);
		fourWD = xFourWD;
	}

	public boolean getFourWD() {
		return fourWD;
	}

	public String toString() {
		return ("Truck: FourWD = " + fourWD + ", " + super.toString());
	}

	public boolean equals(Object xOther) {
		if (this.toString().equals(xOther.toString())) {
			return true;
		}
		return false;
	}
}