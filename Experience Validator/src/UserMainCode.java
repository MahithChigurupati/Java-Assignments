import java.util.*;
public class UserMainCode {
	public static boolean validateExp(String s,String s1)
	{
		int y1=Integer.parseInt(s);
		Date d=new Date();
		Calendar c=Calendar.getInstance();
		int y2=c.get(Calendar.YEAR);
		int y=Math.abs(y1-y2);
		int e=Integer.parseInt(s1);
		if(y>=e)
			return true;
		else
			return false;
	}
}