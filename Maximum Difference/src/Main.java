import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[20];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=UserMainCode.findMaxDistance(a);
		System.out.println(max);
		s.close();
	}
}