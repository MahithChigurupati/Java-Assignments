public class UserMainCode {
	public static int calculateMeterReading(String input1, String input2)
	{
		int n1=Integer.parseInt(input1.substring(5,input1.length()));
		int n2=Integer.parseInt(input2.substring(5,input2.length()));
		int n=Math.abs((n2-n1)*4);
		return n;
	}
}