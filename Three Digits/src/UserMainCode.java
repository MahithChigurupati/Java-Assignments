public class UserMainCode { 
	public static int validatestrings(String s1) {
		int res=0;
		if(s1.matches("(CTS)[-]{1}[0-9]{3}"))
		{
			res=1;
		}
		else
			res=-1;
		return res;
		}
}