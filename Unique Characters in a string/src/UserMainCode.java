class UserMaincode
{
	public static int uniqueCounter(String s1)
	{
		StringBuffer sb = new StringBuffer(s1);
		for (int i = 0; i < sb.length(); i++)
		{
			int count = 0;
			for (int j = i + 1; j < sb.length(); j++) 
			{
				if (sb.charAt(i) == sb.charAt(j))
				{
					sb.deleteCharAt(j);
					j--;
					count++;
				}
			}
			if (count >= 1) 
			{
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.length();
	}
}