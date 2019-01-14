package inheritance;

import interfacesAndPolymorphism.Quadrilateral;

public class Parallelogram extends Quadrilateral {
	private double h;

	public Parallelogram() {
		super();
		h = 999.0;
	}

	public Parallelogram(double nS1, double nS2, double nH) {
		super(nS1, nS2, nS1, nS2);
		h = nH;
	}

	public double getHeight() {
		return h;
	}

	public void setHeight(double nH) {
		h = nH;
	}

	public double area() {
		return (super.getS1() * h);
	}
}
