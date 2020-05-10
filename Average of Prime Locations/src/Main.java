import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,i;
		System.out.println("enter the array size");
		n=s.nextInt();
		int array[]=new int[n];
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		System.out.println(UserMainCode.AverageElements(array));
		s.close();
	}
}