public class UserMainCode
{
	public static String getCombo(String s1,String s2)
	{
		StringBuffer sb=new StringBuffer();
		int p=s1.length();
		int q=s2.length();
		if(p>q)
		{
			sb.append(s1).append(s2).append(s1);
		}
		else
		{
			sb.append(s2).append(s1).append(s2);
		}
		return sb.toString();
	}
}