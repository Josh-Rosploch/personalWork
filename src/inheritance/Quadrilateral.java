package inheritance;

public class Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quadrilateral() {
		s1 = -999.0;
		s2 = -999.0;
		s3 = -999.0;
		s4 = -999.0;
	}

	public Quadrilateral(double nS1, double nS2, double nS3, double nS4) {
		s1 = nS1;
		s2 = nS2;
		s3 = nS3;
		s4 = nS4;
	}

	public void setS1(double nS1) {
		s1 = nS1;
	}

	public double getS1() {
		return s1;
	}

	public void setS2(double nS2) {
		s1 = nS2;
	}

	public double getS2() {
		return s2;
	}

	public void setS3(double nS3) {
		s1 = nS3;
	}

	public double getS3() {
		return s3;
	}

	public void setS4(double nS4) {
		s1 = nS4;
	}

	public double getS4() {
		return s4;
	}

	public double perimeter() {
		return (s1 + s2 + s3 + s4);
	}

	public String toString() {
		return ("Quadrilateral: s1 = " + s1 + ", s2 = " + s2 + ", s3 = " + s3 + ", s4 = " + s4 + ".");
	}
}