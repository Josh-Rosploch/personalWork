package interfacesAndPolymorphism;

import java.util.ArrayList;

public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal> bob = new ArrayList<Animal>();
		bob.add(new Cat());
		bob.add(new Cat());
		bob.add(new Cat());
		bob.add(new Dog());
		bob.add(new Dog());
		bob.add(new Dog());
		for (Animal n : bob) {
			n.act();
			System.out.println(n.toString());
		}
		for (Animal n : bob) {
			if (n instanceof Dog) {
				Dog tempDog = (Dog) n;
				tempDog.vet();
			}
		}
		for (int n = bob.size() - 1; n >= 0; n--) {
			if (bob.get(n) instanceof Cat) {
				Cat tempCat = (Cat) bob.get(n);
				if (tempCat.returnFriendly() == false) {
					bob.remove(n);
				}
			}
		}
		for (

		Animal n : bob) {
			System.out.println(n.toString());
		}
	}
}