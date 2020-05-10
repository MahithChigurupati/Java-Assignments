import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int u=UserMainCode.getSumOfCommonElements(a,b,n,m);
		if(u==-1) {
			System.out.println("No common elements");

		}
		else
		System.out.println(u);
		sc.close();
	}
}