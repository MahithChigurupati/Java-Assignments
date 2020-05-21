import java.util.*;
import java.text.*;
public class UserMainCode {
	public static String ISBNnumber(String ip) {
		String b="FALSE";
		int sum=0;
		for(int i=0,j=ip.length();i<ip.length();i++,j--){
			String s=String.valueOf(ip.charAt(i));
			int n=Integer.parseInt(s);
			sum+=(n*j); 
		}
		if(sum%11==0)
			b="TRUE";
		return b;
	}
}