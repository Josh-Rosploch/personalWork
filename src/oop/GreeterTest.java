package oop;

public class GreeterTest {

	public static void main(String[] args) {

		Greeter bob = new Greeter();

		bob.sayHello();

		System.out.println(bob.getAge());

		bob.setAge(12);

		System.out.println(bob.getAge());

	}
}