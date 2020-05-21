public class UserMainCode {
	public static int addNumbers(int n) {
		int sum=0;int k=0;int sum1=0;
		for(int i=1; i<=n; i++)
		{
			k=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
					k++;
			}
			if(k!=2)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}