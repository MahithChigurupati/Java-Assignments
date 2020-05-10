import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int e=UserMainCode.validatePassword(a);
		if(e==1){
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		sc.close();
	}
}