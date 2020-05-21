import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.next();
		}
		System.out.println(UserMainCode.sumOfDigits(a));
	}
}