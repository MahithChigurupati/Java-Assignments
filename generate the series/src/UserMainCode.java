import java.util.ArrayList;
import java.util.List;
public class UserMainCode {
	public static int addSeries(int n){
		List<Integer> l1=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		if(i%2!=0) {
			l1.add(i);

		}
		int n1=l1.get(0);
		for(int i=1;i<l1.size();i++) {
			if(i%2!=0) {
				n1=n1+l1.get(i);
			}
			else {
				n1=n1-l1.get(i);
			}
		}
		
		return n1;
	}
}