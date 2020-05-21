import java.text.*;
import java.util.*;
public class UserMainCode {
	public static void isLeapyear(String s1) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		GregorianCalendar g=new GregorianCalendar();
		StringTokenizer t=new StringTokenizer(s1,"/");
		String s2=t.nextToken();
		String s3=t.nextToken();
		String s4=t.nextToken();
		int n1=Integer.parseInt(s4);
		Date d1=sdf.parse(s1);
		boolean b=g.isLeapYear(n1);
		System.out.println(b);
	}
}