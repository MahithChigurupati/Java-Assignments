public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int n)
	{
		int n1=0;
		int sum=0;
		while(n!=0)
		{
			n1=n%10;
			if(n1%2==0)
			{
				sum+=n1*n1;
			}
			n=n/10;
		}
		
		return sum;
	}
}