import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class userMainCode{
	public static long calculateExperience(String a, String b, int c)throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d=new Date();
		Date d1=new Date();
		d=sdf.parse(a);
		d1=sdf.parse(b);
		long t=d.getTime();
		long t1=d1.getTime();
		long t3=t1-t;
		long l1=(24 * 60 * 60 * 1000);
		long l=l1*365;
		long res=t3/l;
		return res;
	}
}