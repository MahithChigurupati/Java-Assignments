import java.util.*;
public class Main {
	public static void main(String[]args){ 
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		boolean b1=UserMainCode.validatePhone(s1);
		if(b1==true) { 
			System.out.println("TRUE"); 
		} else 
		{ 
			System.out.println("FALSE");
		}
		s.close();
	}
}