import java.util.*;
public class UserMainCode {
	public static int addAndReverse(int n,int b,int a[])
	{
		int i=0,sum=0,r=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>b)
			{
				sum=sum+a[i];
			}
		}
		while(sum!=0)
		{
			r=((r*10)+(sum%10));
			sum=sum/10;
		}
		return r;
	}
}