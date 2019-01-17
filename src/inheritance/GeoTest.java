package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class GeoTest {
	public static void main(String[] args) {
		Random rng = new Random();
		ArrayList<Geo> shapes = new ArrayList<Geo>();
		for (int n = 0; n > 1000; n++) {
			if (n % 2 != 1) {
				shapes.add(new NewRectangle(rng.nextInt(100), rng.nextInt(100)));
			} else {
				shapes.add(new Trapezoid(rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100),
						rng.nextInt(100)));
			}
		}

		double bigArea = Integer.MIN_VALUE;
		
		for (Geo shape : shapes) {
			if (shape.area() > bigArea) {

			}
		}
	}
}
