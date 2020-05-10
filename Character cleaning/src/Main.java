import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String c=s.nextLine();
		
		String output=UserMainCode.removeCharacter(s1,c);
		
		System.out.println(output);
	}
}