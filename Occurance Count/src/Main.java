import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); String s1=s.nextLine(); String s2=s.nextLine();
		int v=UserMainCode.countWords(s1,s2);
		System.out.println(v);
		s.close();
	}
}