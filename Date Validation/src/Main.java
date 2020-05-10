import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		int b = UserMainCode.getvalues(s);
		if(b==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}