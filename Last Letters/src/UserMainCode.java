import java.util.*;
public class UserMainCode {
	public static String getLastLetter(String input){
		String str1=null;
		StringTokenizer st=new StringTokenizer(input," ");
		StringBuffer sb=new StringBuffer();
		while(st.hasMoreTokens())
		{
			str1=st.nextToken();
			String str2=str1.substring(str1.length()-1);
			String str3= str2.toUpperCase();
			sb.append(str3).append("$");
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
}