import java.util.StringTokenizer;
public class UserMainCode { 
	public static boolean validateIDLocations(String s1, String s2) {
		String s3=s2.substring(0, 3);
		boolean b=false;
		StringTokenizer t=new StringTokenizer(s1,"-");
		String s4=t.nextToken();
		String s5=t.nextToken();
		String s6=t.nextToken();
		if(s4.equals("CTS") && s5.equals(s3) && s6.matches("[0-9]{4}"))
			b=true;
		else{
			
		b=false;
		}
		
		return b;
		}
}