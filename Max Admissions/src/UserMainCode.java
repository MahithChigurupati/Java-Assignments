import java.util.ArrayList; 
public class UserMainCode {
	public static int year (ArrayList<Integer> a1) {
		int max=0,pos=0; 
		for(int i=1;i<a1.size();i+=2) { 
			if(a1.get(i)>max) { 
				max=a1.get(i); 
				pos=i;
			}
		}
		return a1.get(pos-1); 
	}
}