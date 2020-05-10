import java.util.*;
public class UserMainCode {
	public static int getVowels(String s2) {
		if(s2.contains("a") && s2.contains("e") && s2.contains("i") && s2.contains("o") && s2.contains("u") )
		{
			return 1;
		}
		else
			return -1;
	}
}