import java.util.*;
public class UserMainCode
{
	public static String findFruitName(String m,int n)
	{
		int i=0;
		String h=null;
		StringTokenizer st=new StringTokenizer(m,",");
		int max=st.countTokens();
		String[] ss=new String[max];
		while(st.hasMoreElements())
		{
			ss[i++]=st.nextToken();
		}
		if(n>max)
			h=ss[i-1];
		else
			h=ss[n-1];
		return h;
	}
}