import java.util.*;
public class Main {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int []a=new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		if(UserMainCode.scanArray(a)==true)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		sc.close();
	}
}