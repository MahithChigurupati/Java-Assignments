import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class UserMainCode {
	public static String getCapital(HashMap<String,String>hm,String sa)
	{
		String chan=null;
		Iterator<String>it=hm.keySet().iterator();
		StringBuffer sb=new StringBuffer();
		while(it.hasNext())
		{
			String a=it.next();
			if(a.equals(sa))
			{
				chan=hm.get(a);
				sb.append(chan).append("$").append(sa);
			}
		}
		return sb.toString();
	}
}