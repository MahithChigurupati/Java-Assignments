import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		boolean b=UserMainCode.validateIDLocations(s1,s2);
		if(b==true)
			System.out.println("Valid id");
		else
			System.out.println("Invalid id");
		
		sc.close();
	}
}