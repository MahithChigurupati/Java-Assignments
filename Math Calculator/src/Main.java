import java.util.*;
public class Main {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		char c = s.next().trim().charAt(0);
		System.out.println(UserMainCode.calculator(a, b, c));
		s.close();
	}
}