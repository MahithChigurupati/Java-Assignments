import java.text.DecimalFormat;

class UserMainCode{
	public static double AverageElements(int array[]){
		int n, sum=0,count=0,count1=0;
		double average;
		n=array.length;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i%j==0) {
					
					count++;
				}
				if(count==2)
				{
					sum= sum+array[i];
					count1++;
				}
			}
		}
		average= sum/count1;
		DecimalFormat df=new DecimalFormat("#.00");
		double ddd=Double.parseDouble(df.format(average));
		return ddd;
	}
}