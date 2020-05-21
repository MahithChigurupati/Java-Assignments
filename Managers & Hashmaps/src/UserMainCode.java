import java.util.*;
public class UserMainCode
{
	public static HashMap<Integer,Integer> display(HashMap<Integer,String>hm,HashMap<Integer,Integer>hm1)
	{
		HashMap<Integer,Integer>hm3=new HashMap<Integer,Integer>();
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			int id=it.next();
			String name=hm.get(id);
			if(name.equals("manager"))
			{
				int salary=hm1.get(id)+5000;
				hm3.put(id,salary);
			}
		}
		return hm3;
	}
}