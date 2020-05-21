import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode {
	public static String getMaxKeyValue(HashMap<Integer, String> hm) {
		int max=0;
		String s3=null;
		Iterator<Integer>itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			int b=itr.next();
			if(b>max)
			{
				max=b;
				s3=hm.get(b);
			}
		}
		return (s3);
	}
}