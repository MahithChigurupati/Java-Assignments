public class UserMainCode {
	public static int calculateUnique(int a,int b,int c)
	{
		int d=0;
		if(a!=b&&a!=c&&b!=c)
		{
			d=3;
		}
		else if(a==b&&a==c&&b==c)
		{
			d=1;
		}
		else if((a!=b&&a==c&&b==c) || (a!=b&&a!=c&&b==c))
		{
			d=2;
		}
		else if((a==b&&a!=c&&b==c) || (a==b&&a!=c&&b!=c))
		{
			d=2;
		}
		else if((a==b&&a==c&&b!=c) || (a!=b&&a==c&&b!=c))
		{
			d=2;
		}
		return d;
	}
}