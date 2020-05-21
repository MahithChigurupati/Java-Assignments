import java.util.*;
public class Main {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=Integer.parseInt(sc.nextLine());
		System.out.println(UserMainCode.repeatFirstThreeCharacters(s,n));
		sc.close();
	}
}