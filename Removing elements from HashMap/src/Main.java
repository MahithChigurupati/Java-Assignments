import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		int n= s.nextInt(); 
		for(int i=0;i<n;i++){
			hm.put(s.nextInt(),s.next());
		}
		System.out.println(UserMainCode.afterDelete(hm));
		s.close();
	}
}