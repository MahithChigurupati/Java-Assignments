import java.util.*;
public class UserMainCode
{
	public static void removeDuplicates(String s1) {
		char a[]=s1.toCharArray();
		StringBuffer sb=new StringBuffer();
		LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		Iterator<Character>itr=hs.iterator();
		while(itr.hasNext())
		{
			char o=itr.next();
			if(o!=' ');
			{
				sb.append(o);
			}
		}
		System.out.println(sb);
	}
}