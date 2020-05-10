import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] a=new String[n];
		for(int i=0;i<n;i++) {

			a[i]=sc.nextLine();
			
		}
		int m=Integer.parseInt(sc.nextLine());
		System.out.println(UserMainCode.removeElements(a,m));
		sc.close();
	}
}