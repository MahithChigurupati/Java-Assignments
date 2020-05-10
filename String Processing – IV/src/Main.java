import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	int n=s.nextInt();
	System.out.println(UserMainCode.getStringUsingNthCharacter(s1, n));
	s.close();
	}
}