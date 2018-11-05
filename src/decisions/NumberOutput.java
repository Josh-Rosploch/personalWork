package decisions;

public class NumberOutput {
	public static void main(String[] args) {
		for (int n = 1; n <= 5; n++) {
			for (int b = n; b <= 5; b++) {
				if (b <= 5) {
					System.out.print(b + " ");
				}
			}
			System.out.print(n + "\n");
		}
	}
}