public class UserMainCode {
	public static boolean checkPattern(String str)
	{
		String str1=str.substring(0,3);
		int a=0,b=0,c=0;
		char c1=str1.charAt(0);
		char c2=str1.charAt(1);
		char c3=str1.charAt(2);
		boolean b1=false;
		if(Character.isDigit(c1)||Character.isLetter(c1))
		{
			a=1;
		}
		if(c2=='i')
		{
			b=1;
		}
		if(c3=='x')
		{
			c=1;
		}
		if(a==1 && b==1 && c==1)
		{
			b1=true;
		}
		return b1;
	}
}