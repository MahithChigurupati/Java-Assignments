import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int b=UserMainCode.validateColorCode(s1);
		if(b==1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");

		}
		s.close();
	}
}