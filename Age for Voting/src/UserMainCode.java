import java.text.*;
import java.util.*;
public class UserMainCode
{
	public static String getAge(String n)
	{
		Scanner s=new Scanner(System.in);
		int year=0;
		String s1=s.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try
		{
			Date d=sdf.parse(n);
			Date d1=sdf.parse(s1);
			int y= d.getYear();
			int y1=d1.getYear();
			int m=d.getMonth();
			int m1=d1.getMonth();
			int day=d.getDate();
			int day1=d1.getDate();
			year=y1-y;
			if(m>m1) {
				
				year--;
			}
			else if(m==m1)
			{
				if(day<day1) {
					
					year--;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(year>18)
			return "eligible";
		else
			return "not-eligible";
	}
}