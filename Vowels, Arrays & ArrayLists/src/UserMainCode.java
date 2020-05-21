import java.util.*;
public class UserMainCode {
	public static ArrayList<String> matchCharacter (String[] ss)
	{
		ArrayList<String> as=new ArrayList<String>();
		for(int i=0;i<ss.length;i++)
		{
			String sp=ss[i];
			char[] mp=sp.toLowerCase().toCharArray();
			if((mp[0]=='a'||mp[0]=='e'||mp[0]=='i'||mp[0]=='o'||mp[0]=='u')&&(mp[sp.length()-1]=='a'||mp[sp.length()-1]=='e'||mp[sp.length()-1]=='i'||mp[sp.length()-1]=='o'||mp[sp.length()-1]=='u'))
			{
			as.add(sp);
			}
		}
		return as;
	}
}