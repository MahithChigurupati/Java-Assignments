public class UserMainCode { 
	public static boolean scanArray(int[] a)
	{
		int u=0,l=0;
		boolean b=false;
		if(a.length>=4)
		{
			l=4;
		}
		else {
			l=a.length;
		}
		for(int i=0;i<l;i++) {
			if(a[i]==9) {
				u=10;
			}
			if(u==10) {
				b=true;
			}
		}
		return b;
	}
}