public class UserMainCode {
	public static int calculateNcr(int n, int r) {
		int fact=1,fact1=1,fact2=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		for(int i=1;i<=r;i++)
		{
			fact1=fact1*i;
		}
		for(int i=1;i<=(n-r);i++)
		{
			fact2=fact2*i;
		}
		int res=fact/(fact1*fact2);
		return res;
	}
}