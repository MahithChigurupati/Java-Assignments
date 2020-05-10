import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class userMainCode{
	public static String calculateBornDay(String input) throws ParseException{
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf1= new SimpleDateFormat("EEEEE");
		Date d= (Date) sdf.parse(input);
		String s1= sdf1.format(d); 
		return s1;
	}
}