import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int k1=Integer.parseInt(sc.nextLine());
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		for(int i=0;i<k1;i++)
		{
			String k=sc.nextLine();
			String s=sc.nextLine();
			hm.put(k,s);
		}
		String n=sc.nextLine();
		LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
		hm1=UserMainCode.obtainDesignation(hm,n);
		Iterator<String> it=hm1.keySet().iterator();
		while(it.hasNext())
		{
			String s2=it.next();
			System.out.println(s2);
		}
	}
}