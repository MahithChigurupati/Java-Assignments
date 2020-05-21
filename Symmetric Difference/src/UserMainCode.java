import java.util.*;
public class UserMainCode
{
	public static int[] getSymmetricDifference (int[] a1,int[] a2)
	{
	
		int[] union,inter,result;
		int count=0;
		int max = a1.length+a2.length;
		ArrayList<Integer> temp = new ArrayList<Integer>(max);
		for(int i=0;i<a1.length;i++)
		{
			if(!temp.contains(a1[i]))
			{
				++count;
				temp.add(a1[i]);
			}
		}
		for(int i=0;i<a2.length;i++)
		{
			if(!temp.contains(a2[i]))
			{
				++count;
				temp.add(a2[i]);
			}
		}
		union = new int[count];
		for(int i=0;i<count;i++)
		{
			union[i] = (int)temp.get(i);
		}
		Arrays.sort(union);
		temp = new ArrayList<Integer>(max);
		count =0;
		Arrays.sort(a2);
		for(int i=0;i<a1.length;i++)
		{
			if(Arrays.binarySearch(a2,a1[i]) >= 0)
			{
				++count;
				temp.add(a1[i]);
			}
		}
		inter = new int[count];
		for(int i=0;i<count;i++)
		{
			inter[i] = (int)temp.get(i);
		}
		Arrays.sort(inter);
		temp = new ArrayList<Integer>(max);
		count =0;
		Arrays.sort(inter);
		for(int i=0;i<union.length;i++)
		{
			if(Arrays.binarySearch(inter,union[i]) < 0)
			{
				++count;
				temp.add(union[i]);
			}
		}
		result = new int[count];
		for(int i=0;i<count;i++)
		{
			result[i] = (int)temp.get(i);
		}
		Arrays.sort(result);
		return result;
	}
}