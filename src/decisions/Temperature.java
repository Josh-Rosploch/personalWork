package decisions;

public class Temperature {
	public static void main(String[] args) {
		int weather = 53;
		if (weather > 83) {
			System.out.println("Swimming weather");
		} else {
			if (74 < weather && weather <= 83) {
				System.out.println("Tennis");
			} else {
				if (35 < weather && weather <= 74) {
					System.out.println("Golf");
				} else {
					if (-10 < weather && weather <= 35) {
						System.out.println("Snow Shoeing");
					} else {
						if (weather <= -10) {
							System.out.println("Nothing Temp");
						}
					}
				}
			}
		}
	}
}