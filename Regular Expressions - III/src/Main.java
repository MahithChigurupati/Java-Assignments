import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int v=UserMainCode.searchString(s1,s2);
		System.out.println(v);
		s.close();
	}
}