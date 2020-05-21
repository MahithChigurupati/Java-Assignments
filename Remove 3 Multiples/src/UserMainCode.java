import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
public class UserMainCode
{ 
	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> al){
	ArrayList<Integer> al2=new ArrayList<Integer>();
	for(int i=0;i<al.size();i++)
	{
		if((i+1)%3!=0) {
			
			al2.add(al.get(i));
		}
	}
	return al2;
	}
}