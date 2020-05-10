public class UserMainCode { public static int checkSum(int n)
{
	int n1;
	int sum=0;
	int r;
	while(n!=0)
	{
		n1=n%10;
		if(n1%2!=0)
		{
		sum=sum+n1;
		}
		n=n/10;
	}
	if(sum%2==0)
	{
		r=-1;
	}
	else
	{
		r=1;
	} return r;
	}
}