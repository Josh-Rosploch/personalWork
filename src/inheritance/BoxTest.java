package inheritance;

public class BoxTest {
	public static void main(String[] args) {
		Box bob = new Box();
		System.out.println(bob.method1());
		System.out.println(bob.method2());
		System.out.println(bob.method3());
		System.out.println(bob.method5());
		System.out.println("-------------");
		Box bill = new Storage();
		System.out.println(bill.method1());
		System.out.println(bill.method2());
		System.out.println(bill.method3());
		System.out.println(bill.method5());
	}
}