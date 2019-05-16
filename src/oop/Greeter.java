package oop;

public class Greeter {
	private int age;

	public Greeter() {
		age = -999;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}