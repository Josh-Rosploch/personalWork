package decisions;

public class random {
	public static void main(String[] args) {
		int times = 0;
		int high = 100;
		int low = 1;
		for (int r = low; r != high; r = (low + (int) ((Math.random() * (high - low + 1))))) {
			times++;
			System.out.println(r);
		}
		System.out.println("-----\n" + times);
	}
}