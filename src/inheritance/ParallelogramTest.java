package inheritance;

public class ParallelogramTest {
	public static void main(String[] args) {
		Parallelogram shape = new Parallelogram(1.0, 2.0, 3.0);
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println("Area: " + shape.area());
	}
}