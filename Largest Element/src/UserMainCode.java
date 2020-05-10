public class UserMainCode {
	public static int checkLargestAmongCorner(int []a)
	{
		int max=0;
		int x,y,z;
		x=a[0];
		y=a[a.length/2];
		z=a[a.length-1];
		
		if(x>y && x>z) {
			max=x;
		}
		else if(y>x && y>z)
		{
			max=y;
		}
		else if(z>x && z>y)
		{
			max=z;
		}
		return max;
	}
}