import java.util.*;
public class UserMainCode {
	public static String nameFormatter(String s1) {
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(s1," ");
		
		String s2=st.nextToken();
		String s3=st.nextToken();
		
		sb.append(s3).append(",");
		sb.append(s2.substring(0,1).toUpperCase());
		
		return sb.toString();
	}
}