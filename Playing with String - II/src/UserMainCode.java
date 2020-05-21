import java.util.Arrays;
public class UserMainCode
{
	public static String[] sortArray(String s1[],int n){
	String s2[]=new String[n];
	for (int i = 0; i < n; i++)
	{
		s2[i]=s1[i].toLowerCase();
	}
	Arrays.sort(s2);
	return s2;
	}
}