import java.util.StringTokenizer;
public class UserMainCode {
	public static String getWordWithMaximumVowels(String s1)
	{
		int i;
		StringTokenizer t=new StringTokenizer(s1," ");
		int count=0,max=0;
		String s2=null;
		while(t.hasMoreTokens())
		{
			String s3=t.nextToken();
			count=0;
			for(i=0;i<s3.length();i++)
			{
				if(s3.charAt(i)=='a'||s3.charAt(i)=='e'||s3.charAt(i)=='i'||s3.charAt(i)=='o'||s3.charAt(i)=='u'
				||s3.charAt(i)=='A'||s3.charAt(i)=='E'||s3.charAt(i)=='I'||s3.charAt(i)=='O'||s3.charAt(i)=='U') {
					
					count++;
				}
				
			}
			if(count>max)
			{
				max=count;
				s2=s3;
			}
		}
		return s2;
	}
}