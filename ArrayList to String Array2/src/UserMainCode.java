import java.util.*;
public class UserMainCode {
	public static String[] fruitSelector(ArrayList<String> a1,ArrayList<String> a2)
	{
		ArrayList<String> a3=new ArrayList<String>();
		for(int i=0;i<a1.size();i++)
		{
			String s1=a1.get(i);
			if(s1.charAt(s1.length()-1)!='a'&&s1.charAt(s1.length()-1)!='e'&&s1.charAt(s1.length()-1)!='A'&&s1.charAt(s1.length()-1)!='E')
			{
				a3.add(s1);
			}
		}
		ArrayList<String> a4=new ArrayList<String>();
		for(int j=0;j<a2.size();j++)
		{
			String s2=a2.get(j);
			if(s2.charAt(0)!='m'&&s2.charAt(0)!='a'&&s2.charAt(0)!='M'&&s2.charAt(0)!='A')
			{
				a4.add(s2);
			}
		}
		a3.addAll(a4);
		Collections.sort(a3);
		String st[]=new String[a3.size()];
		for(int k=0;k<a3.size();k++)
		{
			st[k]=a3.get(k);
		}
		return st;
	}
}