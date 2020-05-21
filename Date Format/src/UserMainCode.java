import java.text.*;
import java.util.*;
public class UserMainCode { 
	public static String findOldDate(String s1,String s2) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("MM-dd-yyyy");
		Date d1=sdf.parse(s1);
		Date d2=sdf.parse(s2);
		Calendar cal=Calendar.getInstance();
		cal.setTime(d1);
		long y=cal.getTimeInMillis();
		cal.setTime(d2);
		long y1=cal.getTimeInMillis();
		String s3=sdf1.format(d1);
		String s4=sdf1.format(d2);
		if(y<y1)
			return s3;
		else
			return s4;
	}
}