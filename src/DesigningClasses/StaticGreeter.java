package DesigningClasses;

public class StaticGreeter {
	public static void main(String[] args) {
		Greeter joe = new Greeter();
		Greeter bob = new Greeter(16);
		System.out.println("Greeter 1:");
		joe.sayAge();
		System.out.println("Greeter 2:");
		bob.sayAge();
	}
}