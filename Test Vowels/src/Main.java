import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int b=UserMainCode.testVowels(s1);
		if(b==1)
			System.out.println("Yes");
		else
			System.out.println("No");
		s.close();
	}
}