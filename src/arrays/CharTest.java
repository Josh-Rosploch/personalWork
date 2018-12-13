package arrays;

public class CharTest {
	public static void main(String[] args) {
		char letter = 'A';
		for (int i = 0; i < 1000; i++) {
			letter++;
			System.out.println(letter);
		}
	}
}