package interfacesAndPolymorphism;

public class NewRectangleTest {
	public static void main(String[] args) {
		NewRectangle shape = new NewRectangle(10,20);
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println("Area: " + shape.area());
	}
}