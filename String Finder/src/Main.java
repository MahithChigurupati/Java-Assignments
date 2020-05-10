import java.util.*;
public class Main {
public static void main(String[] args) { 
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	String s3=s.next();
	int b=UserMainCode.stringFinder(s1, s2, s3);
	if(b==1)
	{
		System.out.println("yes");
	}
	else
		System.out.println("No");
	s.close();
	}
}