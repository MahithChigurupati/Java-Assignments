public class UserMainCode { 
	public static int addOddNumbers(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i+=2)
		{
			sum=sum+i;
		} 
		return sum;
	}
}