public class UserMainCode {
	public static int reverseNumber(int n)
	{
		int a,r=0;
		while(n!=0)
		{
			a=n%10;
			r=r*10+a;
			n=n/10;
		}
		
		return r;
	}
}