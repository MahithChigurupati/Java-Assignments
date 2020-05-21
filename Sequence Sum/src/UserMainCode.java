import java.util.*;
	public class UserMainCode {
		public static int getFibonacciSum(int n){
		int a=0,b=1,c=0,d=1;
		for(int i=3;i<=n;i++){
			c=a+b;
			a=b; b=c;
			d=d+c;
		}
		return d;
	}
}