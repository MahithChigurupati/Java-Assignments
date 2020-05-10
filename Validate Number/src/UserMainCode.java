public class UserMainCode { 
	public static String validateNumber(String s1)
	{
		String ss="-1";
		if (s1.matches("[-]{1}[0-9]{1,}"))
		{
			String st=s1.replace("-","");
			return st;
		}
		else 
			return ss;
		}
}