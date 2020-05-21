import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserMainCode { 
	public static int dateformat(String s1) throws ParseException { 
		String s2=" ";
		int n=-1; 
		if(s1.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}")) { 
			SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
			Date d=sdf.parse(s1); 
			s2=sdf.format(d); 
			n=1; 
		} else if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{2}")) { 
				SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yy"); 
				Date d1=sdf1.parse(s1); 
				s2=sdf1.format(d1); 
				n=1; 
		} else if(s1.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}")) {
				SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yyyy"); 
				Date d2=sdf2.parse(s1);
				s2=sdf2.format(d2);
				n=1; 
		} else {
			n=-1; 
		}
		return n;
	}
}