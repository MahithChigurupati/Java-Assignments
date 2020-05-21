import java.util.Arrays;
public class UserMainCode
{
	public static int calculateMedian(int[] a)
	{
		Arrays.sort(a);
		int length = a.length; int result=0,mid=0,midNext=0;
		if((length%2) != 0)
		{
			mid = (length/2)+1; result = a[mid];
		}
		else
		{
			mid = length/2;
			midNext = mid+1;
			float add = a[mid-1]+a[midNext-1];
			float div = add/2; result = Math.round(div);
			}
		return result;
	}
}