import java.util.*;

class UserMainCode
{
	public static int largestChunk(String s1) {
		int max=1;
		int b=0;
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens())
		{
			String s2=t.nextToken();
			int n=0;
			for(int i=0;i<s2.length()-1;i++) {
				if(s2.charAt(i)==s2.charAt(i+1)) {
					n++;
					if(n>max)
					{
						max=n;
						b=max+1;
					}
				}
			}
			
			
		}
		return b;
	}
}