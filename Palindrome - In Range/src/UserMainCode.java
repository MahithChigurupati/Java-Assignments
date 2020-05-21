public class UserMainCode {
	public static int addPalindromes(int n1,int n2){
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			int r=0,n3=i;
			while(n3!=0)
			{
				r=(r*10)+(n3%10);
				n3=n3/10;
			}
			if(r==i)
				sum=sum+i;
		}
		return sum;
	}
}