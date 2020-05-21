import java.util.StringTokenizer;
import java.util.*;
public class UserMainCode {
	public static String extractMax(String input1,String input2){
		int max=0;
		String s3=null;
		StringTokenizer st=new StringTokenizer(input1,"-");
		while( st.hasMoreTokens())
		{
			String s2=st.nextToken();
			int n=s2.length();
			if(n>max)
			{
				max=n;
				s3=s2;
			}
		}
		return(s3);
	}
}