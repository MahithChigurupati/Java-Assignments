import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.println(UserMainCode.getAlternateChars(s1));
		s.close();
	}
}