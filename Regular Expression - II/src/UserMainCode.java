public class UserMainCode {
	public static boolean validateString(String s1)
	{
		boolean b=false;
		if(s1.length()==3)
		{
			if(s1.matches("[a-zA-z]{3}"))
			{
				b=true;
			}
		}
		return b;
	}
}