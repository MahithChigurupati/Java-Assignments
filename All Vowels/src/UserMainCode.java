public class UserMainCode {
	public static int getOrderVowels(String s1)
	{
		String s2="aeiou";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					sb.append(s1.charAt(i));
				}
			}
		}
		if(sb.toString().equals(s2))
		{
			return 1;
		}
		return -1;
	}
}