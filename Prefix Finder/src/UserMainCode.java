import java.util.*;
public class UserMainCode
{
	public static int findPrefix (String s[]) {
		LinkedHashSet<String>l1=new LinkedHashSet<String>();
		ArrayList<String>a1=new ArrayList<String>();
		int c=0;
		for(int i=0;i<s.length;i++) {
			
			l1.add(s[i]);
		}
		Iterator<String> it=l1.iterator();
		while(it.hasNext())
		{
			a1.add(it.next());
		}
		for(int i=0;i<a1.size();i++)
		{
			String s2=a1.get(i);
			for(int j=0;j<a1.size();j++)
			{
				String s3=a1.get(j);
				if(i!=j&&s3.length()>s2.length())
				{
					String s4=s3.substring(0,s2.length());
					if(s2.equals(s4)) {
						
						c++;
					}
				}
			}
		}
		return c;
	}
}