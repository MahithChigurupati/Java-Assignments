public class UserMainCode{ 
	public static boolean CheckID(String s)
	{
		boolean b=false;
		if(s.matches("(CPT)[-]{1}[0-9]{6}"))
		{
			b=true;
		}
		else
		{
			b=false;
		}
		return b;
	}
}