package strings;

public class Story {
	private String story;

	public Story(String newStory) {
		story = newStory;
	}

	public String getStory() {
		return story;
	}

	public int wordCount() {
		return story.length();
	}

	public String firstWord() {
		return story.substring(0, story.indexOf(' '));
	}

	public int find(String check) {
		int count = 0;
		for (int num = 0; num < story.length(); num++) {
		}
		return count;
	}
}
