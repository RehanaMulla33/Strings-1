package String;

public class StingImmutable {

	public static void main(String[] args) {

		String s1 = new String("Computer");
		s1.concat("Science");
		System.out.println(s1);
		

		String s2 = new String("Computer");
		s2 = s2.concat("Science");
		System.out.println(s2);

	}
}