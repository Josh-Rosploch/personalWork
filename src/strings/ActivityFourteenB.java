package strings;

public class ActivityFourteenB {
	public static void main(String[] args) {
		ActivityFourteenA bob = new ActivityFourteenA();
		bob.setName();
		bob.setText();
		System.out.println(bob.returnLastNameCapital());
		System.out.println(bob.charInFirstName());
		System.out.println(bob.firstNameHasX());
		System.out.println(bob.wordsInText());
	}
}