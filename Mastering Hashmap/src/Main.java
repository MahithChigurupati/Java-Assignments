import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			h1.put(sc.nextInt(),sc.nextInt());
		}
		System.out.println(UserMainCode.getAverageOfOdd(h1));
		sc.close();
	}
}