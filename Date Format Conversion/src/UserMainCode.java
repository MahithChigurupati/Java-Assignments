import java.util.*;
import java.text.*;
public class UserMainCode {
	public static void convertDateFormate(String s1) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			Date d1=sdf.parse(s1);
			SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yy");
			String s2=sdf1.format(d1);
			System.out.println(s2);
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}
}