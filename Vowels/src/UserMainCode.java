import java.util.StringTokenizer;
public class UserMainCode {
	public static void storeMaxVowelWord(String s1) {
		int i = 0;
		StringTokenizer st = new StringTokenizer(s1," ");
		int len = 0;
		int count = 0;
		int count2 = 0;
		String s6 = null;
		while (st.hasMoreTokens()) {
			String s5 = st.nextToken();
			len = s5.length();
			count=0;
			for (i = 0; i < len; i++) {
				if (s5.charAt(i) == 'a' || s5.charAt(i) == 'e'|| s5.charAt(i) == 'i' || s5.charAt(i) == 'o'|| s5.charAt(i) == 'u'
				||s5.charAt(i) == 'A' ||s5.charAt(i) == 'E' ||s5.charAt(i) == 'I' ||s5.charAt(i) == 'O' ||s5.charAt(i) == 'U') {
					
					count++;
				}
			}
			if (count > count2)
			{
				count2 = count;
				s6 = s5;
			}
		}
		System.out.println(s6);
	}
}