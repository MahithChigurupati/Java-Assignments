import java.util.*;
public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			String s1=s.next();
			hm.put(a,s1);
		}
		System.out.println(UserMainCode.getMaxKeyValue(hm));
	}
}