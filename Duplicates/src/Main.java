import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int sum=UserMainCode.getDistinctSum(a, b, c);
		System.out.println(sum);
		s.close();
	}
}