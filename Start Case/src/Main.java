import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.println(UserMainCode.printCapitalized(s1));
		s.close();
	}
}