import java.util.StringTokenizer;
public class UserMainCode {
	public static int getLargestSpan(String s1) {
		int max=0;
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens())
		{
			String s2=t.nextToken();
			int n=0;
			for(int i=0;i<s2.length()-1;i++) {
				
				if(s2.charAt(i)==s2.charAt(i+1)) {
					
					n++;
				}
			}
			if(n>max) {
				
				max=n;
			}
		}
		return (max+1);
	} 
}