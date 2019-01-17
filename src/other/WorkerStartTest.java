package other;

import java.util.Random;

public class WorkerStartTest {
	public static void main(String[] args) {
		Random rng = new Random();
		WorkerStart[] workers = new WorkerStart[100];
		for (int n = 0; n < 100; n++) {
			workers[n] = new WorkerStart(rng.nextInt(100), rng.nextInt(100));
		}
		WorkerStart smallest = workers[0];
		WorkerStart largest = workers[0];
		for (WorkerStart temp : workers) {
			if (temp.compareTo(smallest) < 0) {
				smallest = temp;
			}
			if (temp.compareTo(largest) > 0) {
				largest = temp;
			}
		}
		System.out.println("Smallest Worker:");
		System.out.println("Hours: " + smallest.getHours());
		System.out.println("Rate: " + smallest.getRate());
		System.out.println("Largest Worker:");
		System.out.println("Hours: " + largest.getHours());
		System.out.println("Rate: " + largest.getRate());
	}
}