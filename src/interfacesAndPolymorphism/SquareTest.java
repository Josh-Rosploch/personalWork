package interfacesAndPolymorphism;

public class SquareTest {
	public static void main(String[] args) {
		Square shape = new Square(10);
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println("Area: " + shape.area());
	}
}
