class UserMainCode
{
	public static int consecutiveRepeatitionOfChar(String input1)
	{
		int c=0;
		int n=0;
		for(int i=0;i<input1.length()-1;i++)
		{
			if(input1.charAt(i)==input1.charAt(i+1)) {
				n++;
			}
			else {
				n=0;
			}
			if(n==2) {
				c++; 
			}
		}
		return c;
	}
}