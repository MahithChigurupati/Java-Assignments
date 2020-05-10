import java.text.DecimalFormat;
import java.util.*;
class UserMaincode
{
	public static double dis(HashMap<Integer,Double> h1)
	{
		double avg=0.0,sum=0.0;
		int k=0;
		for(Map.Entry m:h1.entrySet())
		{
			int a=(Integer)m.getKey();
			if(a%2!=0)
			{
				Double d=(Double) m.getValue();
				sum=sum+d;
				k++;
			}
		}
		avg = (double)sum/k;
		DecimalFormat df = new DecimalFormat(".##");
		String b1 = df.format(avg);
		double b = Double.parseDouble(b1);
		return b;
	}
}