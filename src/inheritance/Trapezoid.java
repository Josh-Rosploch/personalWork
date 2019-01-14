package inheritance;

public class Trapezoid extends Quadrilateral implements Geo {
	private double h;

	public Trapezoid() {
		super();
		h = 999.0;
	}

	public Trapezoid(double nS1, double nS2, double nS3, double nS4, double nH) {
		super(nS1, nS2, nS3, nS4);
		h = nH;
	}

	public double getHeight() {
		return h;
	}

	public void setHeight(double nH) {
		h = nH;
	}

	public double area() {
		return (((super.getS3() + super.getS4()) / 2) * h);
	}
}