import java.util.*;
public class UserMainCode {
	public static ArrayList<Integer> sortMergedArraylist(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		list1.addAll(list2);
		Collections.sort(list1);
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(list1.get(2));
		ans.add(list1.get(6));
		ans.add(list1.get(8));
		return ans;
	}
}