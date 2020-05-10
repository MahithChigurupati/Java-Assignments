import java.text.ParseException;
import java.util.*;
public class Main {
	public static void main(String[] args)throws ParseException {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int c=sc.nextInt();
		long res=(userMainCode.calculateExperience(a,b,c));
		if(res==c)
		{
			System.out.println("true");
		}
		else
		System.out.println("false");
	}
}