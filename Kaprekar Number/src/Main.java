import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int v=UserMainCode.getKaprekarNumber(n);
		if (v==1)
			System.out.println("Kaprekar Number");
		else
			System.out.println("Not a Kaprekar Number");
	}
}