public class UserMainCode {
	public static int validatePassword(String a){
		int d=0;
		if(a.length()>=8){
			if(a.contains("#") || a.contains("@") || a.contains("_"))
			{
				char c= a.charAt(0);
				if(Character.isAlphabetic(c))
				{
					char dd=a.charAt(a.length()-1);
					if((Character.isAlphabetic(dd))||(Character.isDigit(dd)))
					{
						if(a.matches(".*[0-9]{1,}.*")||a.matches(".*[a-zA-Z]{1,}.*"))
						{
						d=1;
						}
					}
				}
			}
		}
		else
		d=-1;
		return d;
	}
}	