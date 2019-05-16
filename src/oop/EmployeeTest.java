package oop;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee bob = new Employee();
		System.out.println(bob.getWage());
		bob.setWage(10.00);
		System.out.println(bob.getWage());
		System.out.println(bob.getExperience());
		bob.setExperience(5);
		System.out.println(bob.getExperience());
		bob.giveRaise();
		System.out.println(bob.getWage());
	}
}