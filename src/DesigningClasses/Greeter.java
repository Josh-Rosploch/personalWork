package DesigningClasses;

public class Greeter {
	private int age;

	public Greeter() {
		age = -999;
	}

	public Greeter(int xAge) {
		age = xAge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void sayAge() {
		System.out.println("I am " + age + " years old!");
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}