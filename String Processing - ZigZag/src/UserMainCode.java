import java.text.*;
import java.util.*;
public class UserMainCode {
	public static void getLastDayOfMonth(String s1) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Calendar cal=Calendar.getInstance();
		Date d1=sdf.parse(s1);
		cal.setTime(d1);
		int n=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(n);
	}
}