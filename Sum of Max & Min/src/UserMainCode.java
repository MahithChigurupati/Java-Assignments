public class UserMainCode {
	public static int getSumMaxMin(int a,int b,int c)
	{
		int d=0;
		if(a<b&&b<c)
		{
			d=a+c;
		}
		else if(a<b&&b>c)
		{
			d=b+c;
		}
		else if(a>b&&b<c)
		{
			d=a+b;
		}
		return d;
	}
}