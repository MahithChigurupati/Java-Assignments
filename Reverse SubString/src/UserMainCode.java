class UserMainCode {
	public static String retrieveString(String input1, int input2, int input3) {
		StringBuffer sb=new StringBuffer(input1);
		sb.reverse();
		String output=sb.substring(input2, input2+input3);
		return output;
	}
}