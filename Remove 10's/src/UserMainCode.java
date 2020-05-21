import java.util.*;
public class UserMainCode {
	public static void removeTens(int a[]){
		int i,k = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (i = 0; i <a.length; i++)
		{
			if (a[i] != 10)
			{
				al.add(a[i]);
			}
		}
		if (al.size() < a.length) 
		{
			k = a.length- al.size();
			for (i = 0; i < k; i++)
			{
				al.add(0);
			}
		}
		
		int b1[] = new int[a.length];
		for (i = 0; i < a.length; i++)
		{
			b1[i] = al.get(i);
			System.out.println(b1[i]);
		}
	}
}