import java.util.*;
public class UserMainCode {
	public static int checkCharacters(String input)
	{
		int r;
		StringTokenizer t = new StringTokenizer(input," "); String s = t.nextToken(); String s1 =s ;
		while(t.hasMoreTokens())
		{
			s1 = t.nextToken();
		} 
		if(s.charAt(0) == s1.charAt(s1.length()-1))
		{
			r=1;
		}
		else
		{
		    r=0;
		}
		
		return r;
	}
}