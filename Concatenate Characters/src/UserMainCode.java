public class UserMainCode
{
	public static String concatCharacter(String[] a)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<a.length;i++) {
			
			sb.append(a[i].charAt(a[i].length()-1));
		}
		return sb.toString();
	}
}