import java.util.*;

class UserMainCode{
	public static int afterDelete(HashMap<Integer, String> hm){
		int count=0;
		Iterator<Integer>itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			int n=itr.next();
			if(n%3!=0)
			{
				count++;
			}
		}
		return count;
	}
}