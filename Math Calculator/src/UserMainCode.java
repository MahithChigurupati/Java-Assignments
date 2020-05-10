public class UserMainCode {
	public static int calculator(int a,int b,char c)
	{
		int a1=0;
		if(c=='*')
		{
			a1=a*b;
		}
		else if(c=='+')
		{
			a1=a+b;
		}
		else if(c=='-')
		{
			a1=a-b;
		}
		else if(c=='/')
		{
			a1=a/b;
		}
		else if(c=='%')
		{
			a1=a%b;
		}
		return a1;
	}
}