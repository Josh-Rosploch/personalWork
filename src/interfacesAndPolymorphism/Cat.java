package interfacesAndPolymorphism;

public class Cat implements Animal{
	private String name;
	private int age;
	private boolean friendly;

	public Cat( ){
		name = "Billy";
		age = 5;
		friendly = true;
	}
	
	public void act() {
		age+=7;
		if(friendly == true) {
			friendly = false;
		} else {
			friendly = true;
		}
	}

	public String toString() {
		return ("Cat class with name of: " + name + ", age of: " + age + ", and friendly: " + friendly);
	}

	public boolean returnFriendly() {
		return friendly;
	}
}
