import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner s=new Scanner(System.in); 
		int n=s.nextInt();
		String[] s1=new String[n]; 
		for(int i=0;i<n;i++) { 
			s1[i]=s.next();
		}
		HashMap<String, String> hm = new HashMap<String, String>(); 
		hm = UserMainCode.putvalues(s1);
		for(Map.Entry<String, String> ans: hm.entrySet()) { 
			System.out.println(ans.getKey()+":"+ans.getValue());
		}
	}
}