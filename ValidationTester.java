package String; 

public class ValidationTester {

	public static void main(String[] args) {
		Validation uv=new Validation();
		String userName=uv.userName("ab");
		System.out.println(userName);
		
		Validation uv1=new Validation();
		String userCity=uv1.userCity("");
		System.out.println(userCity);
		
		Validation uv2=new Validation();
		String userPhone=uv2.userPhone("9886569241");
		System.out.println(userPhone);
		
		Validation uv3=new Validation();
		String userEmail=uv3.userEmail("");
		System.out.println(userEmail);
		
		Validation uv4=new Validation();
		String userPincode=uv4.userPincode("");
		System.out.println(userPincode);
	}

}

