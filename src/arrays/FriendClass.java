package arrays;

public class FriendClass {
	private String name;
	private int age;

	public FriendClass() {
		name = "";
		age = 0;
	}

	public FriendClass(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}
}
