import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fr=sc.nextInt();
		String a[]=new String[fr];
		for(int i=0;i<fr;i++)
		{
			a[i]=sc.next();
		}
		String ba=sc.next();
		UserMainCode.getElementPosition(a,ba);
		sc.close();
	}
}