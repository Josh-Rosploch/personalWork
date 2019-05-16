package oop;

public class Employee {
	private double wage;
	private int experience;

	public Employee() {
		wage = -999.0;
		experience = -999;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double newWage) {
		wage = newWage;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int newExperience) {
		experience = newExperience;
	}

	public void giveRaise() {
		wage = wage * 1.1;
	}
}