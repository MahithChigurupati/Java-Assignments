public class UserMainCode {
	public static String exchangeCharacters(String s1)
	{
		String s2=s1.substring(1,s1.length()-1);
		StringBuffer sb=new StringBuffer();
		char c1=s1.charAt(0);
		char c2=s1.charAt(s1.length()-1);
		sb.append(c2).append(s2).append(c1);
		return sb.toString();
	}
}