import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<String,String> hm=new
		HashMap<String,String>();
		for(int i=0;i<n;i++)
		{
			String s1=sc.next();
			String s2=sc.next();
			hm.put(s1,s2);
		}
		String sa=sc.next();
		System.out.print(UserMainCode.getCapital(hm,sa));
	}
}