public class UserMainCode {
	public static String concatString(int n,String[] s1)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length;i++)
		{
			sb.append(s1[i]).append(",");
		}
		String s2=sb.toString(); String s3=s2.substring(0,s2.length()-1);
		return s3;
	}
}