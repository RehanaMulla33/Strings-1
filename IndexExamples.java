package String;

public class IndexExamples {

	public static void main(String[] args) {
		String s1 = "Xworkz ODC BTM Layout Bangalore";
		String s2 = "Welcome to Rajaji nagar";

		System.out.println(s1.indexOf("BTM"));
		
		System.out.println(s1.indexOf('L'));
		
		System.out.println(s2.indent(7));
		
		System.out.println(s2.indexOf('R', 7));
		
		System.out.println(s1.indexOf("Layout", 9));
		
		System.out.println(s1.lastIndexOf('n'));
		
		System.out.println(s2.lastIndexOf("nagar"));
		
		System.out.println(s1.lastIndexOf("ODC", 10));
		
		System.out.println(s2.lastIndexOf('t', 9));

	}

}
