import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String[] s1 = new String[n1];
		for (int i = 0; i < n1; i++) 
		{
			s1[i] = sc.next();
		}
		int n2 = sc.nextInt();
		String[] s2 = new String[n2];
		for (int i = 0; i < n2; i++)
		{
			s2[i] = sc.next();
		}
		System.out.println(UserMainCode.countCommonStrings(s1,s2));
	}
}