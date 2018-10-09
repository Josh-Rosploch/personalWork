package oop;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee bob = new Employee();
		System.out.println(bob.getWage());
		bob.setWage(65);
		System.out.println(bob.getWage());
	}
}