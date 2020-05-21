public class UserMainCode {
	public static void validatePAN(String s1) {
		if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
	}
}