import java.util.*;
public class UserMainCode { 
	public static int calculateWordSum(String inp) {
	int count=0;
	String st[]=inp.split(" ");
	String s1=st[0];
	String slst=st[st.length-1];
	if(s1.equals(slst))
	{
		count=s1.length();
	}
	else
	{
		count=s1.length()+slst.length();
	} 
	return count;
	}
}