package decisions;

import java.util.Scanner;

public class SandboxTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Enter the length, the width, the depth, and the ammound of sand per hour you can move (in cublic feet)");
		Sandbox bob = new Sandbox(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		System.out.println("It will take " + bob.numHours() + " hours.");
		input.close();
	}
}