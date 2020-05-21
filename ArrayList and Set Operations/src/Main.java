import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<Integer>a1=new ArrayList<Integer>();
		ArrayList<Integer>a2=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			
			a1.add(Integer.parseInt(sc.nextLine()));
		}
		for(int i=0;i<n;i++) {
			
			a2.add(Integer.parseInt(sc.nextLine()));
		}
		char c=sc.nextLine().charAt(0);
		System.out.println(UserMainCode.performSetOperations(a1,a2,c));
	}
}