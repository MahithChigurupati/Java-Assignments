import java.util.*;
public class UserMainCode{ 
	public static String repeatFirstThreeCharacters(String s,int n){
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		if(s.length()>3)
		{ 
			sb.append(s.substring(0,3));
			s=sb.toString();
		}
		for(int i=0;i<n;i++) {
			
			sb1.append(s);
		}
		return sb1.toString();
	}
}