import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int n1=s.nextInt();
		System.out.println(UserMainCode.returnLastRepeatedCharacters(s1,n1));
		s.close();
	}
}