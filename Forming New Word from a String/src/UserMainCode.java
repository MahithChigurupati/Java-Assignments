import java.util.*;
public class UserMainCode {
	public static String formNewWord(String s1,int n)
	{
		String s = new String();
		if(s1.length()>n)
		{
			s = s1.substring(0,n) + s1.substring(s1.length()-n, s1.length());
			return s;
		}
		else
		return null;
	}
}