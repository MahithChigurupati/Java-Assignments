class UserMainCode{
	public static boolean validateColourCode (String s1) {
		boolean b=false;
		if(s1.length()==7&&s1.matches("#[A-F0-9]{1,}"))
		{
			b=true;
		}
		return b;
	}
}