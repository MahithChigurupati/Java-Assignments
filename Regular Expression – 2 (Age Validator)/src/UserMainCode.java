public class UserMainCode {
	public static boolean ValidateAge(String n)
	{
		boolean b = false;
		if(n.matches("[0-9]{2}"))
		{ 
			int a=Integer.parseInt(n);
			if(a>0&&a>=21&&a<=45)
			{
				b=true;
			}
			else
				b=false;
		}
		return b;
	}
}