import java.text.ParseException;
import java.util.*;
public class Main {
	public static void main(String[] args) throws ParseException
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		int output=UserMainCode.getDateDifference(s1,s2);
		System.out.println(output);
		s.close();
	}
}