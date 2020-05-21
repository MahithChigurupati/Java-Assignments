import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]m=new int[size];
		int[]n=new int[size];
		for(int i=0;i<size;i++)
		{
			n[i]=sc.nextInt();
		}
		m=UserMainCode.shiftLeft(n);
		for(int i=0;i<size;i++)
		{
			System.out.println(m[i]);
		}
	}
}