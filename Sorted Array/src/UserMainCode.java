import java.util.*;
public class UserMainCode{
	public static String[] orderElements(String[] arr){
		HashSet<String> al=new HashSet<String>();
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		Iterator<String> itr=al.iterator();
		String ar[] = new String[al.size()];
		int i =0 ;
		while(itr.hasNext()){
			ar[i] = itr.next();
			i++;
		} 
		Arrays.sort(ar); return ar;
	}
}