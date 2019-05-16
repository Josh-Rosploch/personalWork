package decisions;

public class NumberLoopTwo {
	public static void main(String[] args) {
		for (int j = 1; j <= 4; j++) {
			for (int n = 1; n <= 5; n++) {
				if (n == 3) {
					System.out.print(j + "\t");
				} else {
					System.out.print(n + "\t");
				}
			}
			System.out.println("\n\n");
		}
	}
}