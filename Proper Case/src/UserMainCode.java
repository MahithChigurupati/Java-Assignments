import java.util.StringTokenizer;
public class UserMainCode {
	public static String changeCase(String s1){
		StringBuffer s5=new StringBuffer();
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens()){
			String s2=t.nextToken();
			String s3=s2.substring(0,1);
			String s4=s2.substring(1, s2.length());
			s5.append(s3.toUpperCase()).append(s4).append(" ");
		}
		return s5.toString();
	}
}