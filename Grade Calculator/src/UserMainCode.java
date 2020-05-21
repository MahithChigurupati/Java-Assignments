import java.util.*;
public class UserMainCode { 
	public static TreeMap<Integer,String>calculateGrade(HashMap<Integer,Integer>hm) 
	{
		TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext()) 
		{
			int id=it.next(); 
			int mark=hm.get(id); 
			if(mark>=80) 
				tm.put(id,"GOLD");
			else if(mark<80 && mark>=60) 
				tm.put(id,"SILVER");
			else if(mark<60 && mark>=45)
				tm.put(id,"BRONZE");
			else
				tm.put(id,"FAIL"); 
			}
		return tm;
		}
	}