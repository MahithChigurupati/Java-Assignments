public class UserMainCode {
	public static String moveX(String s1)
	{
		String s2="";
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='x')
			{
				s2=s2+s1.charAt(i);
			}
			else
			{
				s3=s3+s1.charAt(i);
			}
		}
		String st=s3.concat(s2);
		return st;
	}
}