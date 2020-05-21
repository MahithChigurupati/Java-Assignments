import java.util.ArrayList;
import java.util.StringTokenizer;
public class UserMainCode
{
	public static String[] manipulateLiteral(String ip1, char ip2)
	{
		StringTokenizer t1 = new StringTokenizer(ip1,"/"); ArrayList<String> lst = new ArrayList<String>();
		while(t1.hasMoreTokens())
		{
			StringBuffer sb = new StringBuffer();
			sb.append(t1.nextToken().toLowerCase());
			lst.add(sb.reverse().toString());
		}
		String[] op = new String[lst.size()];
		for(int i = 0;i<lst.size();i++)
		{
			op[i] = lst.get(i);
		}
		return op;
	}
}