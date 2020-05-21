import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String ip1=s.next();
		char ip2='/';
		String op[]=UserMainCode.manipulateLiteral(ip1,ip2);
		for(int i=0;i<op.length;i++) {
			
			System.out.println(op[i]);
		}
		s.close();
	}
}