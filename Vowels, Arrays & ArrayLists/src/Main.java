import java.util.*;
public class Main {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.nextLine());
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}
		ArrayList<String> arr=new ArrayList<String>();
		arr=UserMainCode.matchCharacter(str);
		Iterator<String> it=arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}