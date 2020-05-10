import java.util.*;
public class Main {
	private static Scanner s ;
	public static void main(String[] args) {
		s = new Scanner (System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i] = s.nextInt();
		}
		System.out.println(UserMainCode.sumCommonElements(a, b));
	}
}