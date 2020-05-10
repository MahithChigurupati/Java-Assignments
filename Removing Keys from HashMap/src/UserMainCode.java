import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode { 
	public static int sizeOfResultandHashMap(HashMap<Integer, String> hm) {
		int count=0;
		Iterator<Integer>itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			int n=itr.next();
			if(n%4!=0)
			{
				count++;
			}
		}
		return count;
	}
}