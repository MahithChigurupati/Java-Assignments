public class UserMainCode {
	public static String getString(String s1){
		StringBuffer sb=new StringBuffer();
		char a=s1.charAt(0);
		char b=s1.charAt(1);
		if(a!='j'&& b!='b')
			sb.append(s1.substring(2));
		else if(a=='j' && b!='b')
			sb.append("j").append(s1.substring(2));
		else if(a!='j' && b=='b')
			sb.append(s1.substring(1));
		else
			sb.append(s1.substring(0));
		
		return sb.toString();
	}
}