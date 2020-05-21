public class UserMainCode {
	public static int testVowels(String s1) {
		int b;
		int n1=0,n2=0,n3=0,n4=0,n5=0;
		String s2=s1.toLowerCase();
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			if(c=='a')
				n1++;
			if(c=='e')
				n2++;
			if(c=='i')
				n3++;
			
			if(c=='o')
				n4++;
			if(c=='u')
				n5++;
		}
		if(n1==1&&n2==1&n3==1&&n4==1&&n5==1)
			b=1;
		else
			b=2;
		return b;
	}
}