import java.util.*; 
class Main { 
	public static void main(String [] args) { 
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int n=s.nextInt();
		n=n*2; 
		for(int i=0;i<n;i++) { 
			a1.add(s.nextInt()); 
		} 
		System.out.println(UserMainCode.year(a1));
		s.close();
	} 
}