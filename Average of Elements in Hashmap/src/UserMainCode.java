import java.text.DecimalFormat;
import java.util.*;
public class UserMainCode
{
	public static String display(HashMap<Integer,Float>hm)
	{
		float sum=0;
		int count=0;
		DecimalFormat df=new DecimalFormat("#.00");
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			int y=it.next();
			if(y%2==0)
			{
				sum=(float) (sum+hm.get(y));
				count++;
			}
		}
		float d=sum/count;
		return df.format(d);
	}
}