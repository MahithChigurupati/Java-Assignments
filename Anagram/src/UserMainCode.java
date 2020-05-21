import java.util.*;
public class UserMainCode
{
	public static void getAnagram(String s1,String s2)
	{
		List<Character> l1=new ArrayList<Character>();
		List<Character> l2=new ArrayList<Character>();
		String s3=s1.replace(" ","");
		String s4=s2.replace(" ","");
		String s5=s3.toUpperCase();
		String s6=s4.toUpperCase();
		for (int i = 0; i < s5.length(); i++)
		{
			l1.add(s5.charAt(i));
		}
		for (int i = 0; i < s6.length(); i++)
		{
			l2.add(s6.charAt(i));
		}
		Collections.sort(l1);
		Collections.sort(l2);
		if(l1.equals(l2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}