package strings;

public class Book {
	private String title;
	private String author;

	public Book(String newAuthor, String newTitle) {
		title = newTitle;
		author = newAuthor;
	}

	public int readingLevel() {
		int level = 3;
		for (int num = 0; num <= 9; num++) {
			if (title.charAt(0) == num) {
				level += 10;
			}
		}
		if (author.length() > 20) {
			level += 9;
		}
		if (title.indexOf('?') != -1) {
			level += 8;
		}
		return level;
	}
}