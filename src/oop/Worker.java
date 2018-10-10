package oop;

public class Worker {
	public int hours;
	public double rate;

	public Worker() {
		hours = -999;
		rate = -999.0;
	}

	public int returnHours() {
		return hours;
	}

	public double returnRate() {
		return rate;
	}

	public void setHours(int newHours) {
		hours = newHours;
	}

	public void setRate(double newRate) {
		rate = newRate;
	}

	public double payCheck() {
		return (hours * rate);
	}

	public void raise(int raiseMoney) {
		rate = (rate + raiseMoney);
	}
}