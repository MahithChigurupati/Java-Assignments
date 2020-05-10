import java.util.*;
public class Main {
	public static void main(String[] arg)
	{
		HashMap<Integer,Double> hm=new HashMap<Integer,Double>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			double s=sc.nextDouble();
			hm.put(a,s);
		} 
		System.out.println(UserMaincode.dis(hm));
	}
}