import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=UserMainCode.getDigitSum(a);
		System.out.println(sum);
	}
}