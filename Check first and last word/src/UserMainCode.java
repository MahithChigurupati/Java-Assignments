import java.util.StringTokenizer;
public class UserMainCode
{
	public static int check(String s)
	{
		int count=0;
		String fin="";
		StringTokenizer st=new StringTokenizer(s);
		String ini=st.nextToken();
		while(st.hasMoreTokens())
		{ 
			fin=st.nextToken();
		}
		if(ini.equals(fin))
			count=ini.length();
		else
			count=ini.length()+fin.length();
		return count;
	}
}