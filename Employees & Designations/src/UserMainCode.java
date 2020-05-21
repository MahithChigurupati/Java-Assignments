import java.util.*;

public class UserMainCode
{
	public static LinkedHashMap<String,String> obtainDesignation(LinkedHashMap<String,String> h1,String n)
	{
		LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
		Iterator<String>it=h1.keySet().iterator();
		while(it.hasNext())
		{
			String s2=it.next();
			String s3=h1.get(s2);
			if(s3.equals(n))
				hm1.put(s2,s3);
		}
		return hm1;
	}
}