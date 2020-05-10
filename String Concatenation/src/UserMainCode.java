public class UserMainCode {
	public static void concatstring(String s1, String s2) {
		StringBuffer sb=new StringBuffer();
		int l1=s1.length();
		int l2=s2.length();
		if(l1==l2)
		{
			sb.append(s1).append(s2);
		}
		else if(l1>l2)
		{
			sb.append(s1.substring(s1.length()-s2.length(),s1.length())).append(s2);
		}
		else if(l1<l2)
		{
			sb.append(s1).append(s2.substring(s2.length()-s1.length(),s2.length()));
		}
		
		System.out.println(sb);
	}
}