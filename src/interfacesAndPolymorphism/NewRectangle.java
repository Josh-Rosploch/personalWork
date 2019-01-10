package interfacesAndPolymorphism;

public class NewRectangle extends Quadrilateral {

	public NewRectangle() {
		setS1(-999.0);
		setS2(-999.0);
		setS3(-999.0);
		setS4(-999.0);
	}

	public NewRectangle(double length, double width) {
		setS1(length);
		setS2(width);
		setS3(length);
		setS4(width);
	}

	public double area() {
		return (getS1() * getS2());
	}
}
