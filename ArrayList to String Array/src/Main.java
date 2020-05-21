import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		ArrayList<String> l=new ArrayList<String>();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			l.add(s.next());
		}
		String a[]=new String[n];
		a=UserMainCode.convertToStringArray(l);
		for(int j=0;j<n;j++)
		{
			System.out.println(a[j]);
		}
	}
}