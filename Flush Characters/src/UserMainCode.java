class UserMainCode{
public static String getSpecialChar(String input){
	int i;
	StringBuffer sb= new StringBuffer();
	for(i=0;i<input.length();i++)
	{ 
		char a=input.charAt(i); if (!Character.isAlphabetic(a)) sb.append(a);
	}
	return sb.toString();
	}
}