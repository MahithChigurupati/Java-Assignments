import java.util.*;
public class Main {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in); 
		String n=s.nextLine();
		boolean b=UserMainCode.ValidateAge(n);
		if(b==true)
		{
			System.out.println("TRUE");
		}
		else
			System.out.println("FALSE");
		s.close();
	}
}