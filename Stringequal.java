package String;

public class Stringequal {

	public static void main(String[] args) {

		String name3 = new String("Rehana");
		String name4 = new String("Rehana");

		if (name3 == name4) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");

		}
		if (name3.equals(name4)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");

		}

	}
}
