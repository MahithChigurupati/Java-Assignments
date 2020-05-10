import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input1=s.next();
		String input2=s.next();
		int input3=s.nextInt();
		System.out.println(UserMainCode.calculateElectricityBill(input1,input2,input3));
		s.close();
	}
}