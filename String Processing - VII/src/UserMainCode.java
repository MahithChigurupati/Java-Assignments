public class UserMainCode { 
	public static boolean isEqual(String s1,String s2,int n){ 
		boolean a=false; if(n<s1.length()&&n<s2.length()) 
		{ 
			char c=s1.charAt(n); 
			char d=s2.charAt(s2.length()-n); 
			String s3=Character.toString(c); 
			String s4=Character.toString(d);
			if(s3.equalsIgnoreCase(s4)) { 
				a=true;
			} else 
			{
				a=false;
			}
		}
		return a; 
	} 
}