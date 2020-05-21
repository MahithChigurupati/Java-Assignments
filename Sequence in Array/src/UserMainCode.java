public class UserMainCode {
	public static boolean searchsequence(int[] a)
	{
		boolean b = false; for(int i = 0 ; i< a.length-3; i++)
		{ 
			if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
				b = true;
		}
		return b;
	}
}