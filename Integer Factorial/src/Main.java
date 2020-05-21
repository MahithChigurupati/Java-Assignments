import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=Integer.parseInt(s.nextLine());;
		int[]k=new int[a];
		for(int i=0;i<a;i++)
		{
			k[i]=s.nextInt();
		}
		LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<Integer,Integer>();
		hm=UserMainCode.getFactorial(k);
		Iterator<Integer> it=hm.keySet().iterator();
		for(int i=0;i<a;i++)
		{
			int n=it.next();
			int fac=hm.get(n);
			System.out.println(n+":"+fac);
			s.close();
		}
	}
}