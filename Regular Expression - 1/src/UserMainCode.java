public class UserMainCode{
	public static String validate(String s)
	{
		String w="FALSE";
		if(s.length()==4 && (Character.isDigit(s.charAt(0))||Character.isAlphabetic(s.charAt(0)))&&s.charAt(1)=='R')
		{
			if(Character.isDigit(s.charAt(2)))
				w="TRUE";
		}
		return w;
	}
}