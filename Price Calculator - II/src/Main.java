import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		HashMap<String, Float> m1=new HashMap<String, Float>();
		for(int i=0;i<n;i++)
		{
			String name=S.next();
			float price=S.nextFloat();
			m1.put(name,price);
		}
		int m=S.nextInt();
		String s[]=new String[m];
		for(int j=0;j<m;j++)
		{
			s[j]=S.next();
		}
		System.out.println(UserMainCode.getTheTotalCostOfPheripherals(m1,s));
	}
}