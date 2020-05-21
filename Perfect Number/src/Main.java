import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean j=(UserMainCode.getPerfection(n));
		if(j==true)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}