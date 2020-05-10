public class UserMainCode {
	public static boolean validateString(String s)
	{
		boolean b=false;
		if(s.charAt(0)=='0'||s.charAt(0)=='1'||s.charAt(0)=='2'||s.charAt(0)=='3'||s.charAt(0)=='4'||s.charAt(0)=='5'||s.charAt(0)=='6'||s.charAt(0)=='7'||s.charAt(0)=='8'||s.charAt(0)=='9')
		{
		b=false;
		}
		else
			b=true; 
		return b;
	}
}