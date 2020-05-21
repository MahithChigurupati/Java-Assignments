import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		int n;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			hm1.put(Integer.parseInt(sc.nextLine()),sc.nextLine());
		}
		ArrayList<String> al1=new ArrayList<String>();
		al1=UserMainCode.getName(hm1);
		Iterator<String> it=al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}