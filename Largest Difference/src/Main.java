import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int[] n1=new int[m];
		for(int i=0;i<m;i++)
		{
			n1[i]=s.nextInt();
		}
		System.out.println(UserMainCode.checkDifference(n1));
		s.close();
	}
}