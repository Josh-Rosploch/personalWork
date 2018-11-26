package strings;

public class CompareTo {
	public static void main(String[] args) {
		String A = "Aa";
		String B = "Bb";
		String a = "aa";
		String b = "bb";
		String c = "bb";
		System.out.println("----------\nA and (B)\n" + A.compareTo(B));
		System.out.println("----------\nB and (A)\n" + B.compareTo(A));
		System.out.println("----------\nA and (a)\n" + A.compareTo(a));
		System.out.println("----------\na and (A)\n" + a.compareTo(A));
		System.out.println("----------\na and (b)\n" + a.compareTo(b));
		System.out.println("----------\nb and (a)\n" + b.compareTo(a));
		System.out.println("----------\nb and (c)\n" + b.compareTo(c));
		System.out.println(A.contains("Ab"));
	}
}