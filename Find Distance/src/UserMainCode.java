public class UserMainCode {
	public static int findDistance(int a,int b,int c,int d) 
	{
		long q=(int)Math.round(Math.sqrt(((a-c)*(a-c))+((b-d)*(b-d))));
		return (int) q;
	}
}