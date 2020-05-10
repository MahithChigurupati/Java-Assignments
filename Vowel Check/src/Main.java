import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s1.toLowerCase();
		
		int output=UserMainCode.getVowels(s2);
		
		if(output==1)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		s.close();
	}
}