import java.util.Calendar;
public class UserMainCode {
	public static int getNumberOfDays(int y,int c)
	{
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH, c);
		int day=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}
}