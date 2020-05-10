import java.util.*;
public class UserMainCode {
	public static String fileIdentifier(String s1)
	{
		StringTokenizer t=new StringTokenizer(s1,".");
		t.nextToken();
		String s2=t.nextToken();
		return s2;
	}
}