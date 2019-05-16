package strings;

public class BookTest {

	public static void main(String[] args) {
		Book newBook = new Book("0hello", "5there");
		System.out.println(newBook.readingLevel());
	}
}