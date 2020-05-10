import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		int c=s.nextInt();
		System.out.println(UserMainCode.getNumberOfDays(y, c));
		s.close();
	}
}