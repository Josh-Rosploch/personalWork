package interfacesAndPolymorphism;

import java.util.Random;

public class Dog implements Animal{
	private String name;
	private int age;
	private boolean injured;

	public Dog( ){
		name = "Bobbb";
		age = 7;
		injured = false;
	}
	
	public void act() {
		Random rng = new Random();
		injured = false;
		age+=7;
		if(1 == (1 + rng.nextInt(50-1+1))) {
			injured = true;
		}
	}

	public String toString() {
		return ("Dog class with name of: " + name + ", age of: " + age + ", and injured: " + injured);
	}

	public void vet() {
		injured = false;
	}
}
