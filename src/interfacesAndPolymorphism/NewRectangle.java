package interfacesAndPolymorphism;

public class NewRectangle extends Parallelogram implements Geo {
	public NewRectangle() {
		super();
	}

	public NewRectangle(double length, double width) {
		super(length, width, width);
	}
}