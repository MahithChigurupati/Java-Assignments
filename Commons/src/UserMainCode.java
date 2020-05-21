import java.util.ArrayList;
public class UserMainCode {
	public static int countCommonStrings(String[] s1,String[] s2)
	{ 
		int count=0;
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if(s1[i].equals(s2[j])){
					if(!al.contains(s1[i])){ 
						count++;
						al.add(s1[i]);
					}
				}
			}
		} return count;
	}
}