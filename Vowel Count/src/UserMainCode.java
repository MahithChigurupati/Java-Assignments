public class UserMainCode {
	public static int tellVowelCount(String s)
	{
		int max=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||
			c=='O'||c=='U')
			{
			count++;
			}
		}
		if(count>max)
		{
			max=count;
		}
		return max;
	}
}