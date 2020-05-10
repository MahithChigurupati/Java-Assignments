public class UserMainCode {
	public static int oddDigitSum (String[] s1) {
		int sum=0;
		for(int i=0;i<s1.length;i++)
		for(int j=0;j<s1[i].length();j++)
		{
			char c=s1[i].charAt(j);
			if(Character.isDigit(c))
			{
				if(c%2!=0)
				{
					String t=String.valueOf(c);
					int n=Integer.parseInt(t);
					sum=sum+n; 
				}
			}
		}
		
		return sum;
	}
}