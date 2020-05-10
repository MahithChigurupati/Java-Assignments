import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		boolean b1=UserMainCode.validateString(s1);
		if(b1==true)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		s.close();
	}
}