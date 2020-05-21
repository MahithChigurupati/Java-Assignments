import java.util.*;
public class Main {
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		ArrayList<String> aa1=new ArrayList<String>();
		for(int i=0;i<m;i++)
		{
			aa1.add(s.next());
		}
		int n=s.nextInt();
		ArrayList<String> aa2=new ArrayList<String>();
		for(int j=0;j<n;j++)
		{
			aa2.add(s.next());
		}
		int k;
		String st[]=UserMainCode.fruitSelector(aa1,aa2);
		for( k=0;k<st.length;k++)
		{
			System.out.println(st[k]);
		}
		if(st.length==0) {
			
			System.out.println("No Fruit Found");
		}
		s.close();
	}
}