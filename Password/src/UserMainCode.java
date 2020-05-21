public class UserMainCode {
	public static boolean validatePassword(String s1)
	{
		boolean b=false;
		if(s1.length()>=8) {
			
			b=true;
		}
		if(b=true)
		{
			if(s1.matches(".*[0-9]{1,}.*")&&s1.matches(".*[a-zA-Z]{1,}.*")&&s1.matches(".*[@#%]{1,}.*"))
			{
				b=true;
			}
			else
				b=false;
		}
		return b;
	}
}