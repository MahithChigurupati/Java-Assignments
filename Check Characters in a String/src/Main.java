import java.util.*; 
public class Main {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		int r=UserMainCode.checkCharacters(input);
		if(r==1)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		s.close();
	}
}