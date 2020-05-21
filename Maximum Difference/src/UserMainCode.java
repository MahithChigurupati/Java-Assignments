public class UserMainCode {
	static int findMaxDistance(int[] a)
	{
		int max=0,index=0;
		for(int i=0;i<19;i++)
		{
			int d=Math.abs(a[i]-a[i+1]);
			if(d>max)
			{
				max=d;
				if(a[i]>a[i+1])
				{
					index=i;
				}
				else
				{
					index=i+1;
				}
			}
		}
		return index;
	}
}