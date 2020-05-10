import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	boolean b=UserMainCode.validateColourCode (s1);
	if(b==true) {
		System.out.println("valid color code");
	}
	else {
		System.out.println("invalid color code");
	}
}
}