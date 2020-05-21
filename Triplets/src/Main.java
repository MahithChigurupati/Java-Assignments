import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean s=UserMainCode.checkTripplets(a);
		if(s==true)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}