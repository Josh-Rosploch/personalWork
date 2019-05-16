package DesigningClasses;

public class MoreRe {
	public int sumTheNum(int n) {
		if (n > 0) {
			return n + sumTheNum(n - 1);
		}
		return 0;
	}

	public int sumTheOdd(int n) {
		if (n % 2 == 0) {
			n -= 1;
		}
		if (n > 0) {
			return n + sumTheOdd(n - 2);
		}
		return 0;
	}

	public int reverse(int n) {
		int rev_num = 0;
		while (n > 0) {
			rev_num = rev_num * 10 + n % 10;
			n = n / 10;
		}
		return rev_num;
	}
}