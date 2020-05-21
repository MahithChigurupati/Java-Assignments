import java.text.*;
import java.util.*;
public class UserMainCode {
	public static String getDayofWeek(String s1) throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
		Date d=sdf.parse(s1);
		String s=sdf1.format(d);
		return s.toLowerCase();
	}
}