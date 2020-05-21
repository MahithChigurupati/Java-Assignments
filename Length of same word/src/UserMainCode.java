import java.util.*;
public class UserMainCode {
	public static int compareLastWords(String s1){
		List<String> l=new ArrayList<String>();
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens())
		{
			String s2=t.nextToken();
			l.add(s2);
		}
		String s3=l.get(0);
		String s4=l.get(l.size()-1);
		if(s3.equals(s4))
		{
			int n=s3.length();
			System.out.println(n);
		}
		else
		{
			int n1=s3.length();
			int n2=s4.length();
			int n=n1+n2;
		}
		return n;
	}
}