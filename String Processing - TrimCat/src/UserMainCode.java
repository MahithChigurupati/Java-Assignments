public class UserMainCode{
	public static String getAlternateChars(String s)
	{
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i < s.length() ; i=i+2)
		{
			sbf.append(s.charAt(i));
		}
		String str = sbf.toString();
		return str;
	}
}