import java.util.ArrayList;
public class UserMainCode
{
	public static int[] arrayListSubtractor(ArrayList<Integer> arrlist1, ArrayList<Integer> arrlist2)
	{
		int count=0,key;
		int max = arrlist1.size();
		if(arrlist1.size() < arrlist2.size())
		max = arrlist2.size();
		ArrayList<Integer> temp = new ArrayList<Integer>(max);
		for(int i=0;i<arrlist1.size();i++)
		{
			key = (int)arrlist1.get(i);
			if(arrlist2.indexOf(key) == -1)
			{
				++count;
				temp.add(key);
			}
		}
		for(int i=0;i<arrlist2.size();i++)
		{
			key = (int)arrlist2.get(i);
			if(arrlist1.indexOf(key) == -1)
			{
				if(!temp.contains(key))
				{
					++count;
					temp.add(key);
				}
			}
		}
		int[] result = new int[count];
		for(int i=0;i<count;i++) {
			
			result[i] = (int)temp.get(i);
		}
		return result;
	}
}