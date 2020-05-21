import java.text.*;
import java.util.*;
public class UserMainCode {
	public static Boolean ValidateDOB(String str){
		Boolean b=false;
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(false);
		try
		{
			Date d1=sdf.parse(str);
			return b= true;
		}
		catch(Exception e)
		{
			return b= false;
		}
	}
}