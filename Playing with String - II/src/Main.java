import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String s1[]=new String[n];
		String s2[]=new String[n];
		for(int i=0;i<n;i++) 
		{
			s1[i]=s.next();
		}
		s2=UserMainCode.sortArray(s1,n);
		for (int i = 0; i < n; i++) {
			System.out.println(s2[i]);
		}
		s.close();
	}
}