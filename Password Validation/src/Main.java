import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String password=s.next();
		int b=UserMainCode.ValidatePassword(password);
		if(b==1){
			System.out.println("Valid Password");
		}
		else{
			System.out.println("Invalid Password");
		}
		
		s.close();
	}
}