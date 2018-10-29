package decisions;

public class NumberLoop {
	public static void main(String[] args) {
		for (int j = 1; j <= 4; j++) {
			for (int k = 1; k <= 5; k++) {
				System.out.print(k * j + "\t");
			}
			System.out.println();
		}
	}
}