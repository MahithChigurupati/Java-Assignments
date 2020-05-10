import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
		{
			list1.add(s.nextInt());
		}
		for (int i = 0; i < 5; i++)
		{
			list2.add(s.nextInt());
		}
		newlist=UserMainCode.sortMergedArraylist(list1,list2);
		for (int i = 0; i < 3; i++)
		{
			System.out.println(newlist.get(i));
		}
		
		s.close();
	}
}