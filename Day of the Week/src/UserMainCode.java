import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class UserMainCode {
	public static String getDay(String s1) throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
		Date d=sdf.parse(s1);
		String s=sdf1.format(d);
		return s;
	}
}