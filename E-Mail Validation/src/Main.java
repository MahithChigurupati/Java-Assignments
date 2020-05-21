import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ip;
		ip=s.next();
		boolean b=UserMainCode.ValidateEmail(ip);
		if(b==true) {
			
			System.out.println("TRUE");
		}
		else
			System.out.println("FALSE");
	}
}