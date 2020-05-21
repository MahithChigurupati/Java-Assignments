import java.util.*;
public class UserMainCode
{
	public static int addUniqueEven(int[] a)
	{
		int sum=0;
		LinkedHashSet<Integer> hm=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hm.add(a[i]);
		}
		Iterator<Integer> im=hm.iterator();
		while(im.hasNext())
		{
			int b=im.next();
			if(b%2==0)
			sum=sum+b;
		}
		if(sum>0)
		{
			return sum;
		}
		else
			return -1;
	}
}