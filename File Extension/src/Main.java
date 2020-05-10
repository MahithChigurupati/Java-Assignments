import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.nextLine();
		String output=UserMainCode.fileIdentifier(s1);
		System.out.println(output);
		s.close();
	}
}