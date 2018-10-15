package oop;

public class Cat {
	public int age;
	public int sleepHours;

	public Cat() {
		age = -999;
		sleepHours = -999;
	}

	public int returnAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public int returnHours() {
		return sleepHours;
	}

	public void setHours(int newHours) {
		sleepHours = newHours;
	}

	public int birthday() {
		age = (age + 1);
		return age;
	}

	public void sleepMore() {
		sleepHours = sleepHours + 1;
	}

	public void sleepLess() {
		sleepHours = sleepHours - 1;
	}
}
