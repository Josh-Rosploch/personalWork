package inheritance;

public class TrapezoidTest {
	public static void main(String[] args) {
		Trapezoid shape = new Trapezoid(1.0, 2.0, 3.0, 4.0, 5.0);
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println("Area: " + shape.area());
	}
}