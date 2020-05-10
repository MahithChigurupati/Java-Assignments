import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		StringBuffer sb1=new StringBuffer(s1.replace(" ",""));
		StringBuffer sb2=new StringBuffer(s2.replace(" ",""));
		
		int output=UserMainCode.commonChars(s1,s2,sb1,sb2);
		System.out.println(output);
		sc.close();
	}
}