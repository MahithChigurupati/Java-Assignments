import java.util.*;
import java.text.*;
public class UserMainCode {
	public static ArrayList<String> getName(HashMap<Integer,String> hm1)
	{
		ArrayList<String> al2=new ArrayList<String>();
		Iterator<Integer> it =hm1.keySet().iterator();
		while(it.hasNext())
		{
			int id=it.next();
			String name=hm1.get(id);
			if(name.matches("[a-z]{1,}.*[0-9]{1,}.*[A-Z]{1}"))
				al2.add(name);
		}
		return al2;
	}
}