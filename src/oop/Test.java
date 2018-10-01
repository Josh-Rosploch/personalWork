package oop;

public class Test {

	public static void main(String[] args) {
		Greeter bob = new Greeter();
		Friend joe = new Friend();
		bob.sayHello();
		bob.sayHello();
		bob.sayHello();
		joe.sayMessage();
		bob.sayHello();
	}
}