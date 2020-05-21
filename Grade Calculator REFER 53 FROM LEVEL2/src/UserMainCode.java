import java.text.*; 
import java.util.*; 
public class UserMainCode { 
	public static TreeMap<Integer,Integer> calculateRevisedSalary(LinkedHashMap<Integer,String>a1,LinkedHashMap<Integer,Integer>a2) throws ParseException {
		TreeMap<Integer,Integer>ans=new TreeMap<Integer,Integer>();
		ArrayList<String>al=new ArrayList<String>(); 
		Iterator <Integer>it=a1.keySet().iterator();
		while(it.hasNext()) {
			int s=it.next(); 
			String s1=a1.get(s); 
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);
			try{
				Date d=new Date();
				Date d1=new Date();
				String a=s1; 
				String b="01-09-2014";
				d=sdf.parse(a);
				d1=sdf.parse(b); 
				long t=d.getTime(); 
				long t1=d1.getTime(); 
				long t3=t1-t;
				long l1=(24 * 60 * 60 * 1000); 
				long l=l1*365; long res=t3/l; 
				if(res>=25 && res<=30) {
					float bonus=(float)((0.2*a2.get(s))+a2.get(s));
					int r=(int)bonus; ans.put(s,r );
					}
				else if(res>30 && res<=60) { 
					float bonus=(float)((0.3*a2.get(s))+a2.get(s)); 
					int r=(int)bonus; 
					ans.put(s,r );
					}
				else if(a2.get(s)<5000) {
					ans.put(s, -100);
					} else if(res<25 ||res>60) {
						ans.put(s, -200); 
						}
				} catch (Exception e) 
				{ 
					e.printStackTrace(); 
				}
		}
		return ans;
	}
}