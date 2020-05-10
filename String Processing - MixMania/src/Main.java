import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean b2=UserMainCode.checkPattern(str);
		if(b2==true)
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