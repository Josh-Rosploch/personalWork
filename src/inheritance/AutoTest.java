package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class AutoTest {
	public static void main(String[] args) {
		int total = 0;
		int totalTwo = 0;
		Random rng = new Random();
		ArrayList<Truck> trucks = new ArrayList<Truck>();
		ArrayList<Car> cars = new ArrayList<Car>();
		for (int n = 0; n < 100; n++) {
			if (n % 2 == 1) {
				trucks.add(new Truck(0, 30, true));
			} else {
				cars.add(new Car(0, 30, 4));
			}
		}
		for (Car temp : cars) {
			temp.drive(5);
			System.out.println(temp.getOdometer());
			System.out.println(temp.getMPG());
			total += temp.getCupHolders();
		}

		for (Truck temp : trucks) {
			temp.drive(rng.nextInt(100));
			System.out.println(temp.getOdometer());
			System.out.println(temp.getMPG());
			totalTwo++;
		}

		System.out.println(total);
		System.out.println(totalTwo);
	}
}