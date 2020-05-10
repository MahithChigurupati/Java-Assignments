import java.text.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(UserMainCode.getMonthDifference(s1,s2));
		sc.close();
	}
}