package oop;

public class Car {
	public double mPG;
	public double maxGas;
	public double totalGas;
	public double odometer;

	public Car() {
		mPG = 20.0;
		maxGas = 20.0;
		totalGas = 20.0;
		odometer = 0.0;
	}

	public double returnMPG() {
		return mPG;
	}

	public void setMPG(double num) {
		mPG = num;
	}

	public double returnMaxGas() {
		return maxGas;
	}

	public void setMaxGas(double num) {
		maxGas = num;
	}

	public double returnTotalGas() {
		return totalGas;
	}

	public void setTotalGas(double num) {
		totalGas = num;
	}

	public double returnOdometer() {
		return odometer;
	}

	public void setOdometer(double num) {
		odometer = num;
	}

	public double fillGasNeed() {
		return (maxGas - totalGas);
	}

	public void fillGas(double num) {
		totalGas += num;
	}

	public void driveCar(double num) {
		odometer += num;
		totalGas -= (num / mPG);
	}
}
