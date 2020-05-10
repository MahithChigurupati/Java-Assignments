import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		for(int i=0;i<s;i++)
		{
			hm.put((sc.nextInt()),(sc.next()));
		}
		System.out.println(UserMainCode.sizeOfResultandHashMap(hm));
		sc.close();
	} 
}