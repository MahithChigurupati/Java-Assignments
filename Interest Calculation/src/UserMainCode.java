import java.text.*;
import java.util.*;
public class UserMainCode
{
	public static TreeMap<String,Integer> calculateInterestRate (HashMap<String,String>hm,HashMap<String,Integer>hm1)
	{
	int year=0,amount=0;
	double dis=0;
	String now="01/01/2015";
	TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
	Iterator<String> it=hm.keySet().iterator();
	while(it.hasNext())
	{
		String id=it.next();
		String dor=hm.get(id);
		amount=hm1.get(id);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		try
		{
			Date d=sdf.parse(dor);
			Date d1=sdf1.parse(now);
			sdf.setLenient(false);
			int y=d.getYear();
			int y1=d1.getYear();
			int m=d.getMonth();
			int m1=d1.getMonth();
			int day=d.getDay();
			int day1=d1.getDay();
			year=y1-y;
			if(m>m1)
				year--;
			else if(m==m1)
			{
				if(day<day1)
					year--;
			}
			if(year>=60) {
				
				dis=0.1*amount+amount;
			}
			else if(year<60 && year>=30 ) {
				
				dis=0.07*amount+amount;
			}
			else {
				
				dis=0.04*amount+amount;
				tm.put(id,(int)dis);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	return tm;
	}
}