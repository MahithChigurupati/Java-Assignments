import java.util.*;
public class Main
{
	public static void main(String[]args) // Second set: 40.Vowel Count//
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int max=UserMainCode.tellVowelCount(s);
		System.out.println(max);
		sc.close();
	}
}