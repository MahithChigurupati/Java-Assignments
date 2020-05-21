import java.util.*;
public class UserMainCode {
	public static int compareDashes(String s1, String s2) {
		ArrayList<Integer>l1=new ArrayList<Integer>();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='-')
			{
				l1.add(i);
			}
		}
		
		ArrayList<Integer>l2=new ArrayList<Integer>();
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='-')
			{
				l2.add(i);
			}
		}
		
		if(l1.equals(l2))
		{
			return 1;
		}
		else
			return 2;
	}
}