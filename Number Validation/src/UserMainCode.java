import java.util.*;
public class UserMainCode { 
	public static int validateNumber(String number)
	{
		int b;
		if(number.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
		{
			b=1;
		}
		else
		{
			b=0;
		} 
		return b;
	}
}