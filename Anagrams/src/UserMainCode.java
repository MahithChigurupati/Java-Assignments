import java.util.*;
import java.text.*;
public class UserMainCode {
	public static boolean checkAnagram(String s1,String s2)
	{
		boolean b=false;
		String aj1 =s1.toLowerCase(); 
		String aj2=s2.toLowerCase();
		ArrayList<Character> a1 = new ArrayList<Character>();
		ArrayList<Character> a2 = new ArrayList<Character>();
		for(int i=0;i<aj1.length();i++)
		{
			char c=aj1.charAt(i);
			if(c!=' ')
			{
				a1.add(c);
			}
		}
		for(int j=0;j<aj2.length();j++)
		{
			char c=aj2.charAt(j);
			if(c!=' ')
			{
				a2.add(c);
			}
		}
		if(a1.size()==a2.size())
		{
			if(a1.containsAll(a2))
			{
				b= true;
			}
		}
		return b;
	}
}