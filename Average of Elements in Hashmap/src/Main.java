import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		HashMap<Integer,Float>hm=new HashMap<Integer,Float>();
		for(int i=0;i<s;i++)
		{
			int r=sc.nextInt();
			Float j=sc.nextFloat();
			hm.put(r,j);
		}
		System.out.println(UserMainCode.display(hm));
		sc.close();
	}
}