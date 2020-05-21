import java.util.StringTokenizer;
public class UserMainCode {
	public static boolean scanStarNeighbors (String input) {
		boolean b=false;
		StringTokenizer t=new StringTokenizer(input,"*");
		String s1=t.nextToken();
		String s2=t.nextToken();
		String s3=s1.substring(s1.length()-1);
		String s4=s2.substring(0,1);
		if(s3.equalsIgnoreCase(s4)) {
			
			b=true;
		}
		return b;
	}
}