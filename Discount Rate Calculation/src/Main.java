import java.util.*;
public class Main{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int s=Integer.parseInt(sc.nextLine());
		HashMap<String,String>hm=new HashMap<String,String>();
		HashMap<String,Integer>hm1=new HashMap<String,Integer>();
		for(int i=0;i<s;i++)
		{
			String id=sc.nextLine();
			hm.put(id, sc.nextLine());
			hm1.put(id,Integer.parseInt(sc.nextLine()));
		}
		TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
		tm=UserMainCode.calculateDiscount(hm,hm1);
		Iterator<String> it=tm.keySet().iterator();
		while(it.hasNext())
		{
			String n=it.next();
			int fac=tm.get(n);
			System.out.println(n+":"+fac);
		}
	}
}