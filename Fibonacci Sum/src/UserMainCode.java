public class UserMainCode { 
	public static int getSumOfNfibos(int n){ 
		int a=-1,b=1,c=0,d=0; 
		for(int i=0;i<n;i++)
		{
			c=a+b; d=d+c; a=b; b=c; 
		} 
		return d; 
		}
}