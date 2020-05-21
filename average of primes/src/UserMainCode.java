import java.util.*;
public class UserMainCode {
	public static int addPrimeIndex(int n) {
		Scanner sc=new Scanner(System.in);
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int sum=0;
		int count=0;
		int sum_count=0;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+a[i];
				sum_count++;
			}
		}
		int avg=sum/sum_count;
		return avg;
	}
}