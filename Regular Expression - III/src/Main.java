import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		if(UserMainCode.validateString(s1)==true) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		s.close();
	}
}