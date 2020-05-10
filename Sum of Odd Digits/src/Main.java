import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=UserMainCode.checkSum(n);
		
		if(r==1)
		{
			System.out.println("The sum of odd digits are odd");
		}
		else
		{
			System.out.println("The sum of odd digits are even");
		}
		
		s.close();
	}
}