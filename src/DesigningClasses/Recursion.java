package DesigningClasses;

public class Recursion {

	public Recursion() {
	}

	public void printHello(int howMany) {
		System.out.println(howMany + " begins.");
		if (howMany > 0) {
			System.out.println("Hello");
			printHello(howMany - 1);
		}
		System.out.println(howMany + " ends.");
	}

	public void printHelloTwo(int howMany) {
		if (howMany > 0) {
			printHelloTwo(howMany - 1);
		}
		System.out.println("Hello");
	}

	public void printNum(int num) {
		if (num > 0) {
			System.out.println(num);
			printNum(num - 1);
		}
	}

	public void printNumTwo(int num) {
		if (num > 0) {
			System.out.println(num);
		}
		printNumTwo(num - 1);
	}

	public void printNumThree(int num) {
		printNumThree(num - 1);
		if (num > 0) {
			System.out.println(num);
		}
	}

	public int sumOne(int num) {
		if (num > 0) {
			return (num + sumOne(num - 1));
		}
		return 0;
	}

	public void stuff(int num) {
		if (num > 0) {
			System.out.println(num * 2);
			stuff(num - 2);
		}
	}

	public void stuffTwo(int num) {
		stuffTwo(num - 2);
		if (num > 3) {
			System.out.println(num * 2);
		}
	}

	public void stuffThree(int num) {
		if (num > 3) {
			stuffThree(num - 2);
			System.out.println(num * 2);
		}
	}

	public int activityOne(int num) {
		if (num > 0) {
			return num + activityOne(num - 1);
		}
		return 0;
	}
}