import java.text.*;
import java.util.*;
public class UserMainCode {
	public static ArrayList<String> retirementEmployeeList(LinkedHashMap<String,String>a1) throws ParseException
	{
		ArrayList<String>al=new ArrayList<String>();
		Iterator <String>it=a1.keySet().iterator();
		while(it.hasNext())
		{
			String s=it.next();
			String s1=a1.get(s);
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			try{
				Date d=new Date();
				Date d1=new Date();
				String a=s1;
				String b="01/01/2014";
				d=sdf.parse(a);
				d1=sdf.parse(b);
				long t=d.getTime();
				long t1=d1.getTime();
				long t3=t1-t;
				long l1=(24 * 60 * 60 * 1000);
				long l=l1*365;
				long res=t3/l;
				if(res>=60)
				{
					al.add(s);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		Collections.sort(al);
		return al;
	}
}