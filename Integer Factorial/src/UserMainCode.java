import java.util.LinkedHashMap;
public class UserMainCode
{
	public static LinkedHashMap<Integer,Integer> getFactorial(int[] k)
	{
		LinkedHashMap<Integer,Integer> hm1=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<k.length;i++)
		{
			int u=1;
			for(int j=1;j<=k[i];j++)
			{
				u=u*j;
			}
			hm1.put(k[i],u);
		}
		return hm1;
	}
}