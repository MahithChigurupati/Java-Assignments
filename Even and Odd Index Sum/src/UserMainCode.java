import java.util.*;
public class UserMainCode {
	public static void sumOfOddEvenPositioned(int n) {
		int rem = 0, i = 0;
		int a[] = new int[10];
		while (n > 0) {
			rem = n % 10;
			a[i] = rem;
			n = n / 10;
			i++;
		}
		int sume = 0, sumo = 0;
		for (int j = i - 1; j >= 0; j--) {
			if(j%2!=0)
			{
				sumo = sumo + a[j];
			}
			else
			{
				sume = sume + a[j];
			}
		}
		if (sume == sumo) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}
}