public class UserMainCode {
	public static int searchString(String s1,String s2){
		int c=0;
		int t=s2.length();
		for(int i=0;i<s1.length()-t+1;i++){
			if(s2.equals(s1.substring(i,t+i))){
				c++;
			}
		}
		return c;
	}
}