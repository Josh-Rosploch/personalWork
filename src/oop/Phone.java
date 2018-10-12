package oop;

public class Phone {
	public int phoneNum;
	public int speedDial;
	public int lastNum;
	public int emergency;
	public int numCalls;
	public int numMin;

	public Phone() {
		phoneNum = -1;
		speedDial = -1;
		lastNum = -1;
		emergency = 911;
		numCalls = 0;
		numMin = 0;
	}

	public int returnPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int num) {
		phoneNum = num;
	}

	public int returnSpeedDial() {
		return speedDial;
	}

	public void setSpeedDial(int num) {
		speedDial = num;
	}

	public int returnLastNum() {
		return lastNum;
	}

	public void setLastNum(int num) {
		lastNum = num;
	}

	public int returnEmergency() {
		return emergency;
	}

	public int returnNumCalls() {
		return numCalls;
	}

	public void setNumCalls(int num) {
		numCalls = num;
	}

	public int returnNumMin() {
		return numMin;
	}

	public void setNumMin(int num) {
		numMin = num;
	}

	public void makeACall(int num, int min) {
		lastNum = num;
		numCalls++;
		numMin += min;
	}
}
