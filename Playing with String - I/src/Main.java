import java.util.Scanner;
public class Main
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		String[] sc=new String[n];
		for(int i=0;i<n;i++)
		{
			sc[i]=s.nextLine();
		}
		int a=Integer.parseInt(s.nextLine());
		System.out.println(UserMainCode.formString(n,sc,a));
		s.close();
	}
}