import java.text.ParseException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println(UserMainCode.calculateBornDay(s1));
		sc.close();
	}
}