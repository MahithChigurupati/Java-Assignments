import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		UserMainCode.validatePAN(s1);
		s.close();
	}
}