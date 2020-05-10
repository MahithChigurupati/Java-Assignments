import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode {
	public static String calculateBornDay(String s1) throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
		SimpleDateFormat sdf1=new SimpleDateFormat("MMMM");
		Date d=sdf.parse(s1);
		String s=sdf1.format(d);
		return s.toUpperCase();
	}
}