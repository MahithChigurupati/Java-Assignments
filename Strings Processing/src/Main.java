import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int n=sc.nextInt();
		String k=UserMainCode.findFruitName(str, n);
		System.out.println(k);
		sc.close();
	}
}