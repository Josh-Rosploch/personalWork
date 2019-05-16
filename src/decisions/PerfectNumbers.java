package decisions;

public class PerfectNumbers {
	public static void main(String[] args) {
		int a = 0;
		for (int n = 0; n != 1000; n++) {
			for (int div = 1; n > div; div++) {
				if(n%div == 0) {
					a += div;
				}
			}
			if (a == n){
				System.out.println(n + " is a perfect number.");
			}
			a = 0;
		}
	}
}