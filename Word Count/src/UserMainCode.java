public class UserMainCode { 
	public static int countWord(int n,String str[],int c)
	{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()==c)
			{
				count++;
			}
		}
		return count;
	}
}