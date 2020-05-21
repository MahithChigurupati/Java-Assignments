import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		int b=UserMainCode.getOrderVowels(s1);
		if(b==1)
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
		sc.close();
	}
}