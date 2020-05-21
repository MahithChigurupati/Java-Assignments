import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int n;
		Scanner sin = new Scanner(System.in);
		n = sin.nextInt();
		String[] a1 = new String[n];
		for(int i=0;i<n;i++)
		{
			a1[i] = sin.next();
		}
		a1 = UserMainCode.orderElements(a1);
		for(int i=0;i<a1.length;i++) {
			
			System.out.println(""+a1[i]);
		}
	}
}