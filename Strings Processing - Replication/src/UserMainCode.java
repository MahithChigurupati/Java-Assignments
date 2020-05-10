public class UserMainCode {
	public static String repeatString(String s1,int n)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		{
			sb.append(s1);
		} 
		
		return sb.toString();
	}
}