import java.util.*;
import java.text.*;
public class UserMainCode
{
	public String nextYearDay(String s1)
	{
		String s=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			Date d1=sdf.parse(s1);
			Calendar cal=Calendar.getInstance();
			cal.setTime(d1);
			cal.add(Calendar.YEAR, 1);
			Date d2=cal.getTime();
			SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
			s=sdf1.format(d2);
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		return s;
	}
}