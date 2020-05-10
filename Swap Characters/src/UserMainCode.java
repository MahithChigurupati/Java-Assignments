import java.util.*;
public class UserMainCode {
	public static String swapCharacter(String s1)
	{
		StringBuffer sb=new StringBuffer();
		int l=s1.length();
		if(l%2==0)
		{
			for(int i=0;i<s1.length()-1;i=i+2)
			{
				char a=s1.charAt(i);
				char b=s1.charAt(i+1);
				sb.append(b).append(a);
			}
			return sb.toString();
		}
		else
		{
			for(int i = 0;i<s1.length()-1;i=i+2)
			{
				char a=s1.charAt(i);
				char b=s1.charAt(i+1);
				sb.append(b).append(a);
			}
			sb.append(s1.charAt(l-1));
			return sb.toString();
		}
	}
}