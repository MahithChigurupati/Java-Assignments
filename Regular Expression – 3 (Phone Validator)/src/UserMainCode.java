public class UserMainCode { 
	public static boolean validatePhone(String s1) { 
		boolean b=false;
		if(s1.matches("[0]{1}[0]{1}[0-9]{8}") ) { 
			b=false;
		}
		else {
			b=true; 
		} 
		return b;
		}
}