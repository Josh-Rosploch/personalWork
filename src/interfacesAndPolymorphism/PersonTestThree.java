package interfacesAndPolymorphism;

import java.util.ArrayList;

public class PersonTestThree {
	public static void main(String[] args) {
		ArrayList<Person> somePerson = new ArrayList<Person>();
		somePerson.add(new Student());
		somePerson.add(new Student());
		somePerson.add(new Student());
		somePerson.add(new Teacher());
		somePerson.add(new Teacher());
		somePerson.add(new Teacher());
		for (int n = 0; n < somePerson.size(); n++) {
			if (somePerson.get(n) instanceof Student) {
				Student kid = (Student) somePerson.get(n);
				kid.outSick();
			}
			System.out.println("Name: " + somePerson.get(n).getName());
		}
	}
}
