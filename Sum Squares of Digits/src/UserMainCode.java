import java.util.*;
public class UserMainCode {
	public static void getSumOfSquaresOfDigits(int n) {
		int a=n;
		int rem=0;
		int sum=0;
		while(a!=0)
		{
			rem=a%10;
			sum=sum+(rem*rem);
			a=a/10;
		}
		System.out.println(sum);
	}
}