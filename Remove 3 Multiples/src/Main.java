import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		al1=UserMainCode.removeMultiplesOfThree(al);
		Iterator it=al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}