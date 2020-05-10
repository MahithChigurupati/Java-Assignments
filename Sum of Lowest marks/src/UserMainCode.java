import java.util.*;

class UserMainCode {
	public static int getLowest(HashMap<Integer,Integer>h1)
	{
		ArrayList<Integer>a1=new ArrayList<Integer>();
		int m=0;
		Iterator<Integer> it=h1.keySet().iterator();
		while(it.hasNext())
		{
			int x=it.next();
			a1.add(h1.get(x));
		}
		Collections.sort(a1);
		m=a1.get(0)+a1.get(1)+a1.get(2);
		return m;
	}
}