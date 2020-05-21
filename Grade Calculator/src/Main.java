import java.util.*; 
public class Main {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt(); 
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int i=0;i<s;i++) { 
			hm.put(sc.nextInt(),sc.nextInt()); 
			} 
		TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
		tm=UserMainCode.calculateGrade(hm);
		Iterator<Integer> it=tm.keySet().iterator();
		for(int i=0;i<s;i++) { 
			int n=it.next();
			String fac=tm.get(n);
			System.out.println(n); 
			System.out.println(fac);
			} 
		}
	}