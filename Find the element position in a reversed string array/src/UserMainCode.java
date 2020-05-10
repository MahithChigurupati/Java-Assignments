import java.util.*;
public class UserMainCode{
	public static void getElementPosition(String[] a, String b) {
		ArrayList<String>al=new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		Collections.sort(al);
		Collections.reverse(al);
		for(int i=0;i<al.size();i++)
		{
			if(b.equals(al.get(i)))
			{
				System.out.println(i+1);
			}
		}
		}
}