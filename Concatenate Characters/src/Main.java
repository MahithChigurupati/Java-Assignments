import java.util.*;
public class Main
{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int s=Integer.parseInt(sc.nextLine());
		String []a=new String[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextLine();
		}
		System.out.println(UserMainCode.concatCharacter(a));
		sc.close();
	}
}