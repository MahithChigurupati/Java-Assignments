class UserMainCode{ 
	public static String repeatString(String input, int n){
		StringBuffer sb= new StringBuffer();
		String s1= new String(); 
		if (n==1)
		{
			s1=input.substring(0,1);
			sb.append(s1).append(" ");
		} 
		if(n==2)
		{
			s1=input.substring(0,2); for(int i=0;i<n;i++)
			sb.append(s1).append(" ");
		} 
		if(n>=3)
		{
			s1=input.substring(0,3); for(int i=0;i<n;i++)
			sb.append(s1).append(" ");
		}
		return sb.toString();
	}
}