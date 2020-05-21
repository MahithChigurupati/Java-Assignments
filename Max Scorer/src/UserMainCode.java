import java.util.*;
public class UserMainCode
{
	public static String highestScorer(ArrayList<String>s1)
	{
		int max=0;
		String s4=null;
		for(int i=0;i<s1.size();i++)
		{
			String s2=s1.get(i);
			StringTokenizer t=new StringTokenizer(s2,"-");
			String s3=t.nextToken();
			int n1=Integer.parseInt(t.nextToken());
			int n2=Integer.parseInt(t.nextToken());
			int n3=Integer.parseInt(t.nextToken());
			int n=n1+n2+n3;
			if(n>max)
			{
				max=n;
				s4=s3;
			}
		}
		return s4;
	}
}