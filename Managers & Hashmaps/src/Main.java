import java.util.*;
public class Main {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int s=Integer.parseInt(sc.nextLine());
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();
		for(int i=0;i<s;i++)
		{
			int id=Integer.parseInt(sc.nextLine());
			hm.put(id, sc.nextLine());
			hm1.put(id,Integer.parseInt(sc.nextLine()));
		}
		HashMap<Integer,Integer>hm2=new HashMap<Integer,Integer>();
		hm2=UserMainCode.display(hm,hm1);
		Iterator<Integer> it=hm2.keySet().iterator();
		while(it.hasNext())
		{
			int n=it.next();
			int fac=hm2.get(n);
			System.out.println(n);
			System.out.println(fac);
		}
	}
}