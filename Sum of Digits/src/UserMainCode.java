public class UserMainCode {
	public static int getDigits(String s1)
	{
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
		char a=s1.charAt(i);
		if(Character.isDigit(a))
		{
		int b=Integer.parseInt(String.valueOf(a));
		sum=sum+b;
		}
		}
		return sum;
	}
}