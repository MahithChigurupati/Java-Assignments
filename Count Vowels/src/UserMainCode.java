public class UserMainCode{
	public static int countVowels(String s1)
	{
		String s2=s1.toLowerCase();
		String s3="aeiou";
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<s3.length();j++)
			{
				if(s2.charAt(i)==s3.charAt(j))
				{
					count++;
				}
			}
		}
		return count;
	}
}
