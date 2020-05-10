import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		UserMainCode.concatstring(s1,s2);
		s.close();
	}
}