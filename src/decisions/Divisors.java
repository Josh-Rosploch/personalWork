package decisions;

public class Divisors {
	public static void main(String[] args) {
		// Total Divisors
		int tD = 0;
		// Biggest Total Divisors
		int bTD = 0;
		// Biggest Number
		int bN = 0;
		// n = Number
		for (int n = 1; n <= 1000; n++) {
			System.out.print("Divisors for " + n + ": ");
			// div = Divisor Test
			for (int div = 1; div <= n; div++) {
				// Decide if the divisor can divide evenly
				if (n % div == 0) {
					// Add number to Total Divisors count
					tD++;
					// Output the number in a line
					System.out.print((n / div) + "\t");
				}
			}
			System.out.println("\nTotal divisors for " + n + " is: " + tD + "\n-----------------------------------------------------------------------------------");
			// Check if the total is larger than the previous total
			if (tD > bTD) {
				// Replace old total with the new total
				bTD = tD;
				// Replace the old number with the new number
				bN = n;
			}
			// Reset the total numbers
			tD = 0;
		}
		// Output the biggest Int
		System.out.println("The biggest number is " + bN + " with " + bTD + " divisors.\n-----------------------------------------------------------------------------------");
	}
}