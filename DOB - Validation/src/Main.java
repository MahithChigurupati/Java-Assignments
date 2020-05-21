import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		Boolean b=UserMainCode.ValidateDOB(str);
		if(b==true)
			System.out.println("TRUE");
		if(b==false)
			System.out.println("FALSE");
	}
}