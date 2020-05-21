public class UserMainCode{
	public static int getSubstring(String s,String s1){ 
		int t=s1.length();
		int count=0; 
		for(int i=0;i<s.length()-t+1;i++) {
			String s3=s.substring(i,t+i); 
			if(s3.equals(s1)) {
				count++; 
			}
		}
		return count;
	}
}