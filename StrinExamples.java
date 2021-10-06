package String;

public class StrinExamples {

	public static void main(String[] args) {
		String userName = "World Wide Web";
		String name="Technology";

		int indexOf = userName.indexOf('b');
		System.out.println(indexOf);

		char charAt = userName.charAt(4);
		System.out.println(charAt);

		int lenghtOfString = userName.length();
		System.out.println(lenghtOfString);

		boolean contains = userName.contains("Wide");
		System.out.println(contains);

		char[] charArray = userName.toCharArray();
		System.out.println(charArray[7]);

		boolean startsWith = userName.startsWith("Wo");
		System.out.println(startsWith);

		boolean endsWith = userName.startsWith("Web");
		System.out.println(endsWith);
		
		if(userName.equals(name)) {
			System.out.println("String are equal");
		} else {
			System.out.println("String are not equal");
			
		}
		}
		
		


	}


