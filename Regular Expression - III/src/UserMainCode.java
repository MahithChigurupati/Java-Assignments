public class UserMainCode
{
	public static String passwordValidation(String a)
	{
		String k;
		if(a.matches(".*[0-9]{1,}.*")&&a.matches(".*[@#$]{1,}.*")&&a.length()>=8&&a.matches(".*[A-Z]{1,}.*")&&a.matches(".*[a-z].*"))
		{
			k="validinput";
		}
		else
		{
			k="Invalidinput";
		}
		return k;
	}
}