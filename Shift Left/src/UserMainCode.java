public class UserMainCode {
	public static int[] shiftLeft(int n[])
	{
		int j=0;
		int[]m=new int[n.length];
		for(int i=0;i<n.length;i++)
		{
			if(n[i]!=5)
			{
				m[j]=n[i];
				j++;
			}
		}
		return m;
	}
}