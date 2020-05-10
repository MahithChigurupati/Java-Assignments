class userMainCode {
	public static String getString(String input, int n)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(input); for (int i=0;i<n;i++){ sb.append(input.substring(input.length()-n,input.length()));
	}
	return sb.toString();
	}
}