public class UserMainCode{ 
	public static String encrypt(String s1) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(i%2==0)
			{
				if(c==122)
				if((c==122)&&(i==0))
				{
					c='A';
				}
				else
				c=(char) (c-25);
				else{
				c=(char) (c+1);
				}
				sb.append(c);
			}
			else
			sb.append(c);
		}
		return sb.toString();
	}
}