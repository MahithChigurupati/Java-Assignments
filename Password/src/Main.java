import java.util.*;
public class Main {
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		boolean b=(UserMainCode.validatePassword(s1));
		if(b==true)
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
		s.close();
	}
}