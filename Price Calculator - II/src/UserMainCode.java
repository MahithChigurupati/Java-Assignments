import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode {
	public static float getTheTotalCostOfPheripherals(HashMap<String,Float> m1, String[] s) {
		Float f=(float) 0;
		Iterator<String> i=m1.keySet().iterator();
		while(i.hasNext())
		{
			String s1=i.next();
			Float f1=m1.get(s1);
			for(int j=0;j<s.length;j++) {
				
				if(s[j].equals(s1)) {
					
					f+=f1; 
				}
			}
		}
		return f;
	}
}