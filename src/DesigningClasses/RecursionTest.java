package DesigningClasses;

public class RecursionTest {
	public static void main(String[] args) {
		Recursion bob = new Recursion();
		bob.printHello(3);
		System.out.println("----------");
		bob.printHelloTwo(3);
		System.out.println("----------");
		bob.printNum(3);
		/*
		 * Bad System.out.println("----------"); bob.printNumThree(3);
		 */
		/*
		 * Bad System.out.println("----------"); bob.printNumThree(3);
		 */
		System.out.println("----------");
		System.out.println(bob.sumOne(3));
		System.out.println("----------");
		bob.stuff(8);
		/*
		 * Bad System.out.println("----------"); bob.stuffTwo(7);;
		 */
		System.out.println("----------");
		bob.stuffThree(7);
		System.out.println("----------");
		System.out.println(bob.activityOne(5));
	}
}
