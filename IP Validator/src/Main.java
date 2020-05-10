import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ipAddress=sc.next();
		boolean b=UserMainCode.validateIpAddress(ipAddress);
		if(b==true) {
			System.out.println("Valid");

		}
		else {
			System.out.println("Invalid");

		}
		sc.close();
	}
}