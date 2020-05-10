public class UserMainCode {
	public static int checkDifference(int[] n1){
		int n2,n3=0,n4=0,i;
		for(i=0;i<n1.length-1;i++)
		{
			n2=Math.abs(n1[i]-n1[i+1]);
			if(n2>n3)
			{
				n3=n2;
				n4=i+1; 
			}
		}
		return n4;
	}
}