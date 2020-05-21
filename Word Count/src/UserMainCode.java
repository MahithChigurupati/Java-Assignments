public class UserMainCode {
	public static int sumOfDigits(String[] s1)
	{
		int sum = 0;
		for(int i=0;i<s1.length;i++)
		{
			String s = s1[i];
			for(int j = 0;j<s.length();j++)
			{
				Character c = s.charAt(j);
				if(Character.isDigit(c))
				{
					sum+=Integer.parseInt(s.valueOf(c));
				}
			}
		}
		return sum;
	}
}