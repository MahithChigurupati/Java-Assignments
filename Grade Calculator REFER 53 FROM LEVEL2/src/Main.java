import java.text.*;
import java.util.*; 
public class Main {
	public static void main(String args[]) throws ParseException{
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		LinkedHashMap<Integer,String>a1=new LinkedHashMap<Integer,String>();
		LinkedHashMap<Integer,Integer>a2=new LinkedHashMap<Integer,Integer>(); 
		TreeMap<Integer,Integer>ans=new TreeMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			a1.put(id,sc.next());
			int salary=sc.nextInt(); 
			a2.put(id,salary);
		}
		ans=UserMainCode.calculateRevisedSalary(a1,a2); 
		Iterator <Integer>it=ans.keySet().iterator();
		while(it.hasNext()) {
			int a=it.next(); 
			int b=ans.get(a); 
			System.out.println(a); 
			System.out.println(b); 
			}
		}
	}