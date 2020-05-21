import java.text.*;
import java.util.*;
public class UserMainCode
{
	public static TreeMap<String,Integer> calculateDiscount (HashMap<String,String>hm,HashMap<String,Integer>hm1)
	{
		int amount=0;
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
			sdf.setLenient(false);
			try{
				Date d=new Date();
				Date d1=new Date();
				String a=dor;
				String b="01-01-2014";
				d=sdf.parse(a);
				d1=sdf.parse(b);
				long t=d.getTime();
				long t1=d1.getTime();
				long t3=t1-t;
				long l1=(24 * 60 * 60 * 1000);
				long l=l1*365;
				long year1=t3/l;
				if(year1>=5 && amount>=20000)
					dis=0.2*amount;
				else if(year1<5 && amount>=20000)
					dis=0.1*amount;
				else if(year1>=5 && amount<20000)
					dis=0.15*amount;
				else
					dis=0.05*amount;
					tm.put(id,(int)dis);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return tm;
	}
}