import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		int p=UserMainCode.compareDashes(s1,s2);
		if(p==1)
			System.out.println("Yes");
		else
			System.out.println("No");
		s.close();
	}
}