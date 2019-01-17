package other;

import java.util.Random;
import java.util.ArrayList;

public class CatStartTest {
	public static void main(String[] args) {
		Random rng = new Random();
		ArrayList<CatStart> cats = new ArrayList<CatStart>();
		for (int n = 0; n < 100; n++) {
			cats.add(new CatStart(rng.nextInt(100), rng.nextInt(100)));
		}
		CatStart smallest = cats.get(0);
		CatStart largest = cats.get(0);
		for (CatStart temp : cats) {
			if (temp.compareTo(smallest) < 0) {
				smallest = temp;
			}
			if (temp.compareTo(largest) > 0) {
				largest = temp;
			}
		}
		System.out.println("Smallest Cat:");
		System.out.println("Age: " + smallest.getAge());
		System.out.println("Sleep: " + smallest.getSleep());
		System.out.println("Largest Cat:");
		System.out.println("Age: " + largest.getAge());
		System.out.println("Sleep: " + largest.getSleep());
	}
}