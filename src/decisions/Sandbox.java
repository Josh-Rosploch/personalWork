package decisions;

public class Sandbox {
	private double length;
	private double width;
	private double depth;
	private double sph;

	public Sandbox() {
		length = -999;
		width = -999;
		depth = -999;
		sph = -999;
	}

	public Sandbox(double newLength, double newWidth, double newDepth, double newSPH) {
		if (newLength > 0 && newLength < 5000) {
			length = newLength;
		} else {
			length = 10;
		}
		if (newWidth > 0 && newWidth < 5000) {
			width = newWidth;
		} else {
			width = 10;
		}
		if (newDepth > 0 && newDepth < 5000) {
			depth = newDepth;
		} else {
			depth = 10;
		}
		if (newSPH > 0 && newSPH < 500) {
			sph = newSPH;
		} else {
			sph = 10;
		}
	}

	public void setSPH(double newSPH) {
		if (newSPH > 0 && newSPH < 500) {
			sph = newSPH;
		} else {
			sph = 10;
		}
	}

	public double numHours() {
		return (length * width * depth / sph);
	}
}