public class UserMainCode {
	public static String formString(int n,String[] input,int a)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		{
			if(input[i].length()>=a)
			{
				String a1=input[i];
				sb.append(a1.charAt(a-1));
			}
			else
			{
				sb.append('$');
			}
		}
		return sb.toString();
	}
}