package interfacesAndPolymorphism;

import java.util.ArrayList;

public class PersonTestTwo {
	public static void main(String[] args) {
		ArrayList<Person> somePerson = new ArrayList<Person>();
		somePerson.add(new Student());
		somePerson.add(new Student());
		somePerson.add(new Student());
		somePerson.add(new Teacher());
		somePerson.add(new Teacher());
		somePerson.add(new Teacher());
		for (int n = 0; n < somePerson.size(); n++) {
			System.out.println("Name: " + somePerson.get(n).getName());
			if (somePerson.get(n).getName().length() > 10) {
				System.out.println("Age: " + somePerson.get(n).getAge());
			}
		}
	}
}
