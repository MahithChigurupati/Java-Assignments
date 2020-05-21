import java.util.*; 
public class UserMainCode{
	public static HashMap<String, String> putvalues(String[] s1) {
		HashMap<String, String> hm = new HashMap<String, String>();
		ArrayList<String> lst1 = new ArrayList<String>(); 
		ArrayList<String> lst2 = new ArrayList<String>();
		for(String s : s1) {
			
			lst1.add(s.toUpperCase().substring(0,3)); 
		}
		for(String s : s1) {
			
			lst2.add(s); 
		}
		for(int i=0;i<s1.length;i++) { 
			hm.put(lst1.get(i),lst2.get(i));
		}
		return hm;
		}
}