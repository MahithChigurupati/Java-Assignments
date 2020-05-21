public class UserMainCode {
	public static boolean getPerfection(int n){
		boolean b=false;
		int sum=0;
		for(int i=1;i<n;i++){
			int r=n%i;
			if(r==0) {
				
				sum=sum+i;
			}
		}
		b=(sum==n);
		return b;
	}
}