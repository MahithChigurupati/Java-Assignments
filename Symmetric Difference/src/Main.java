import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int n,m;
		Scanner sin = new Scanner(System.in);
		n = sin.nextInt();
		int[] a1 = new int[n];
		for(int i=0;i<n;i++)
		{
			a1[i] = sin.nextInt();
		}
		m = sin.nextInt();
		int[] a2 = new int[m];
		for(int i=0;i<m;i++)
		{
			a2[i] = sin.nextInt();
		}
		int[] result = UserMainCode.getSymmetricDifference (a1,a2);
		for(int i=0;i<result.length;i++) {
			
			System.out.println(result[i]);
		}
	}
}