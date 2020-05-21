public class UserMainCode {
	public static int getKaprekarNumber(int a)
	{
		int count=0,j=0;
		int a1=a;
		while(a1!=0)
		{
			count=count+1;
			a1=a1/10;
		}
		int square=a*a;
		String s=Integer.toString(square);
		String s1=s.substring(0,count);
		String s2=s.substring(count);
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		int result =x+y;
		if(result==a){
			j=1;
		}
		else
		{
			j=2;
		}
		return j;
	}
}