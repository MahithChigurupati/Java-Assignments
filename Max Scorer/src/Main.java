import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<String> s1=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
		s1.add(s.next());
		}
		System.out.println(UserMainCode.highestScorer(s1));
		s.close();
	}
}