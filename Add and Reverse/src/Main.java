import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		System.out.println(UserMainCode.addAndReverse(n,b,a)) ;
		sc.close();
	}
}