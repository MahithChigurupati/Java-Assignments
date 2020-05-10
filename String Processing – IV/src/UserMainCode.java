public class UserMainCode {
	public static String getStringUsingNthCharacter(String s1,int n)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(s1.charAt(0));
		for(int i=n-1;i<s1.length();i+=n)
		{
			sb.append(s1.charAt(i));
		}
		return sb.toString();
	} 
}