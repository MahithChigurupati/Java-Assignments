import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int n,m;
		Scanner sin = new Scanner(System.in);
		n = sin.nextInt();
		ArrayList<Integer> a1 = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			int k = sin.nextInt();
			a1.add(k);
		}
		m = sin.nextInt();
		ArrayList<Integer> a2 = new ArrayList<Integer>(m);
		for(int i=0;i<m;i++)
		{
			int k = sin.nextInt();
			a2.add(k);
		}
		int[] result = UserMainCode.arrayListSubtractor(a1,a2);
		Arrays.sort(result);
		for(int i=0;i<result.length;i++) {
			
			System.out.println(result[i]);
		}
	}
}