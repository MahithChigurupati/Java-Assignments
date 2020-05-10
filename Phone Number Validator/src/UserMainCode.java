public class UserMainCode {
	public static int validatePhoneNumber(String s1)
	{
		String s2 = s1.replaceAll("-", "");
		if (s2.matches("[0-9]{10}"))
		{
			return 1;
		}
		else
			return 2;
	}
}