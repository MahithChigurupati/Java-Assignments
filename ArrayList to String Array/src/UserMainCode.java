import java.util.*;
public class UserMainCode
{
	public static String[] convertToStringArray(ArrayList<String> l)
	{
		Collections.sort(l);
		String [] a = l.toArray(new String[l.size()]);
		return a;
	}
}