import java.util.StringTokenizer;
public class UserMainCode {
	public static void countWord(String s1){
		StringTokenizer st=new StringTokenizer(s1," ");
		int n=st.countTokens();
		System.out.println(n);
	}
}