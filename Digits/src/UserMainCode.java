public class UserMainCode {
	public static int countSeven(int n)
	{
		int rem,sum=0;
		while(n>0)
		{
		rem=n%10;
		if(rem==7)
		{
			sum++;
		}
			n=n/10;
		}
		return sum;
	}
}