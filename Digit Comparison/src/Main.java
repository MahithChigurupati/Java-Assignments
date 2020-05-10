import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		int d=s.nextInt();
		boolean res=UserMainCode.compareLastDigit(c,d);
		if(res==true)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		s.close();
	}
}