import java.util.StringTokenizer;
public class UserMainCode {
	public static boolean ValidateEmail(String ip) {
		int i=0;
		boolean b=false;
		StringTokenizer t=new StringTokenizer(ip,"@");
		String s1=t.nextToken();
		String s2=t.nextToken();
		StringTokenizer t1=new StringTokenizer(s2,".");
		String s3=t1.nextToken();
		String s4=t1.nextToken();
		if(ip.contains("@") && ip.contains(".")) {
			
			i++;
		}
		if(i==1) {	
			if(s3.length()==5) {
				if(s1.length()>=3) {
					if(s4.equals("com")) {		
						b=true;
					}
				}
			}
		}
		return b;
	}
}