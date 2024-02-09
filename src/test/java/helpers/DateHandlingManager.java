package helpers;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateHandlingManager {
	
	
	public static String getDateInCST(DateFormat dateFormat)
	{
		Calendar calendar = Calendar.getInstance();
		TimeZone fromTimeZone = calendar.getTimeZone();
		TimeZone toTimeZone = TimeZone.getTimeZone("CST");

		calendar.setTimeZone(fromTimeZone);
		calendar.add(Calendar.MILLISECOND, fromTimeZone.getRawOffset() * -1);
		if (fromTimeZone.inDaylightTime(calendar.getTime())) {
		    calendar.add(Calendar.MILLISECOND, calendar.getTimeZone().getDSTSavings() * -1);
		}

		calendar.add(Calendar.MILLISECOND, toTimeZone.getRawOffset());
		if (toTimeZone.inDaylightTime(calendar.getTime())) {
		    calendar.add(Calendar.MILLISECOND, toTimeZone.getDSTSavings());
		}	
	
		return dateFormat.format(calendar.getTime()).toString();
	}
	
	public static String getDateInUTC(DateFormat dateFormat)
	{
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));		
		return dateFormat.format(cal.getTime()).toString();
	}
	
	public static String getDate(DateFormat dateFormat)
	{
		return getDateInCST(dateFormat);
	}
		
}
