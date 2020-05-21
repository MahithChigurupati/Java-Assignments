import java.util.*;
public class UserMainCode {
	public static int sumElements(int a[])
	{
		LinkedHashSet<Integer>h1=new LinkedHashSet<Integer>();
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			h1.add(a[i]);
		}
		Iterator<Integer> it=h1.iterator();
		while(it.hasNext())
		{
			int k=it.next();
			if(k%2==0)
			{
				s=s+k;
			}
		}
		if(s>0)
			return s;
		else
			return -1;
	}
}