import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String s[]=new String[n];
		for(int i=0;i<n;i++) {
			
			s[i]=sc.nextLine();
		}
		System.out.println(UserMainCode.findPrefix(s));
	}
}