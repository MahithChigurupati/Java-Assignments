public class UserMainCode{
	public static String returnLastRepeatedCharacters(String s1, int n1)
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < n1 ; i++) {
			sb.append(s1.substring(s1.length()-n1, s1.length()));
		}
		return sb.toString();
	}
}