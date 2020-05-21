import java.util.*;
public class UserMainCode {
	public static int getAverageOfOdd(HashMap<Integer,Integer>h1)
	{
		int av=0,c=0,s=0;
		Iterator<Integer> it=h1.keySet().iterator();
		while(it.hasNext())
		{
			int a=it.next();
			if(a%2!=0)
			{
				int b=h1.get(a);
				s=s+b;
				c++;
			}
		}
		av=s/c;
		return av;
	}
}