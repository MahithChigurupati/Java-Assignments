import java.util.StringTokenizer;
public class UserMainCode {
	public static String fetchUserName(String s1) {
		StringTokenizer st=new StringTokenizer(s1,"@");
		String s2=st.nextToken();
		return(s2);
	}
}