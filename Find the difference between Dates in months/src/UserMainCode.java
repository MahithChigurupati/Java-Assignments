public class UserMainCode {
	public static int removeElements(String[] a,int m){
		int u=a.length;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()==m) {
				u--;

			}
		}
		return u;
	}
}