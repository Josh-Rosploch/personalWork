package interfacesAndPolymorphism;

public class PersonTestOne {
	public static void main(String[] args) {
		Person bob = new Teacher();
		System.out.println("Name " + bob.getName() + ". Age: " + bob.getAge());
		bob = new Student();
		System.out.println("Name " + bob.getName() + ". Age: " + bob.getAge());
		// next
		Teacher bil = new Teacher();
		Student who = new Student();
		bil.setName("Bill");
		bil.payMe();
		who.setName("Bobby");
		who.outSick();
		who.outSick();
		who.outSick();
		Person bile = who;
		System.out.println("Name " + bile.getName() + ". Age: " + bile.getAge());
		bile = who;
		System.out.println("Name " + bile.getName() + ". Age: " + bile.getAge());
	}
}