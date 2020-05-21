public class UserMainCode
{
	public static int getDigitSum(int n)
	{
		int sum = 0 ;
		int n1=n;
		while(n>10)
		{
			int a = 0 ; sum = 0;
			while(n!=0)
			{
				a = n%10;
				sum+=a;
				n=n/10;
			}
			n=sum;
		}
		return sum;
	}
}