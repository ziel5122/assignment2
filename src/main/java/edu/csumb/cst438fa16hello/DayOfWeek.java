package edu.csumb.cst438fa16hello;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class DayOfWeek {
    public static String day(Calendar calendar) {
	return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
    }

    public static String today() {
	TimeZone PST = new SimpleTimeZone(-8*60*60*1000, "America/Los_Angeles");
  	return day(new GregorianCalendar(PST));
    }
}
