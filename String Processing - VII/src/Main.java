import java.util.Scanner;
public class Main { 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		String s1=s.nextLine(); 
		String s2=s.nextLine();
		int n=s.nextInt();
		boolean output=UserMainCode.isEqual(s1,s2,n);
		System.out.println(output); s.close(); 
	}
}