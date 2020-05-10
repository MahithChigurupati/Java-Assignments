import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String number=s.next(); int r=UserMainCode.validateNumber(number); 
		if(r==1)
		{
			System.out.println("Valid number format");
		}
		else
		{
			System.out.println("Invalid number format");
		}
		
		s.close();
	}
}