class UserMainCode { 
	public static int getMaxSpan(int[] x,int n)
	{
		int gap=0,max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(x[i]==x[j])
					gap=j;
			}
				if(gap-i>max)
					max=gap-i;
		} 
		return max+1;
	}
}