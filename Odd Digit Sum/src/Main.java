import java.util.Scanner;
public class Main {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s1=sc.nextInt();
		String[] s2 = new String[s1];
		
		for (int i = 0; i < s1; i++)
		{
			s2[i] = sc.next();
		}
		System.out.println(UserMainCode. oddDigitSum(s2));
	}
}