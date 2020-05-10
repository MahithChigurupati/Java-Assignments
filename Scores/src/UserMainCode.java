public class UserMainCode {
	public static boolean checkScores(int arr[], int n){
		boolean b = false;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i] == 100)
			{
				if(arr[i+1] == 100)
				{
					b = true;
					break;
				}
			}
		}
		return b;
	}
}