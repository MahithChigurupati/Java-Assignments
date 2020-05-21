import java.util.*;
public class UserMainCode {
	public static String swapPairs(String s1)
	{
		int i;
		StringBuffer sb=new StringBuffer();
		for(i=0;i<s1.length()-1;i=i+2)
		{
			if(i%2==0)
			{
				char a=s1.charAt(i);
				char b=s1.charAt(i+1);
				sb.append(b).append(a);
			}
			else
				for(i=0;i<s1.length()-1;i=i+2)
				{
					char a=s1.charAt(i);
					char b=s1.charAt(i+1);
					sb.append(b).append(a);
					sb.append(s1.charAt(s1.length()-1));
				}
		}
		return sb.toString();
	}
}