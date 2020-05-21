import java.text.ParseException;
import java.util.*; 
class Main { 
	public static void main(String [] args) throws ParseException {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int b=UserMainCode.dateformat(s1); 
		if(b==1) { 
			System.out.println("Valid");
		}
		else { 
			System.out.println("Invalid"); 
		} 
		s.close(); 
	}
}