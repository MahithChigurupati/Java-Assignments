public class UserMainCode {
	public static boolean compareLastDigit(int c,int d)
	{
		int c1=c%10;
		int d1=d%10;
		boolean b=false;
		if(c1==d1)
		{
			b=true;
		}
		return b;
	}
}