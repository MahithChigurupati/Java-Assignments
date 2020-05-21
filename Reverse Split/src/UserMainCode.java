public class UserMainCode {
	public static String reShape(String s,String s1){ 
		StringBuffer sb=new StringBuffer(s); 
		StringBuffer sb2=new StringBuffer(); 
		String s2=sb.reverse().toString(); 
		for(int i=0;i<s2.length();i++) { 
			sb2.append(s2.charAt(i)); 
			sb2.append(s1); 
			}
		sb2.deleteCharAt(sb2.length()-1);
		return sb2.toString();
		}
}
