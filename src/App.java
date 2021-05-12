import java.time.DayOfWeek;
import java.util.*;

public class App {
	public static void main(String[] args) throws Exception {
		/**
		 * The get() method of Calender class returns the value of the parameter fields
		 * passed into it. Fields like DAY_OF_MONTH, MONTH, YEAR, WEEK, WEEK_OF_YEAR etc
		 * are passed as parameter to this method.
		 * 
		 * int java.util.Calendar.get(int field)
		 */
		/**
		 * This method adds the specified (signed) amount of time to the given calendar
		 * field, based on the calendar's rules
		 * 
		 * public void add(int field,int amount)
		 */

		/**
		 * The setTime () method of java.util.Calendar class is used to set the Time of
		 * current calendar object. A Date object id is passed as the parameter into
		 * this method.
		 * 
		 * public final void setTime(Date date)
		 */

		// Calendar java.util.Calendar.getInstance()
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		// create a calendar
		System.out.println(" Date :" + cal.getTime());

		// public final void set(int year, int month, int date, int hourOfDay, int
		// minute, int second)
		// Date java.util.Calendar.getTime()
		// Date dt=cal.getTime();
		cal1.set((cal1.HOUR), 1);
		Date dt = cal1.getTime();
		cal.set(2001, 4, 4); // set function set the given date to the currentinstance .

		cal.setTime(dt);
		System.out.println(" new temp is :" + cal.getTime());
		cal.set(2001, 8, 4); // set function set the given date to the currentinstance .

		System.out.println(" new Date is :" + cal.getTime());

		System.out.println(cal.getDisplayName(cal.DAY_OF_WEEK, cal.LONG).toUpperCase()); /
		/**
		 * The getDisplayName() method of java.util.Calendar class returns String
		 * representation of the calendar field value passed as parameter in a given
		 * style and local. Style and local are also passed as parameter. If no String
		 * representation is available, getDisplayName() returns null value. If String
		 * representation is available, get() method is called to access the calendar
		 * field value.
		 * 
		 * public String getDisplayName(int field, int style, Locale locale)
		 */
	}
	/**
	 * public void set(int field, int value)
	 * 
	 * public final void set(int year, int month, int date)
	 * 
	 * public final void set(int year,int month, int date, int hourOfDay, int
	 * minute)
	 * 
	 * public final void set(int year, int month, int date, int hourOfDay, int
	 * minute, int second)
	 */
	// yyyy/mm/dd/hh/mn/ss

	/**
	 * set() setFirstDayOfWeek() setMinimalDaysInFirstWeek() setTimZone()
	 * setWeekDate() setTimeInMillis() setTime()
	 */
}

/**
 * java.util.GregorianCalendar // the type of calendar is used
 * 
 * [
 * 
 * time=1620811036382, // this time is in sec the time areFieldsSet=true, *
 * 
 * areAllFieldsSet=true, * Not necessary to know lenient=true, *
 * 
 * zone=sun.util.calendar.ZoneInfo[
 * 
 * id="Asia/Calcutta", // time-zone id
 * 
 * offset=19800000, // Not necessary to know dstSavings=0, useDaylight=false,
 * 
 * transitions=7,
 * 
 * lastRule=null],
 * 
 * firstDayOfWeek=1,
 * 
 * minimalDaysInFirstWeek=1,
 * 
 * ERA=1,
 * 
 * YEAR=2021, // YEAR this is an constant
 * 
 * MONTH=4,
 * 
 * WEEK_OF_YEAR=20,
 * 
 * WEEK_OF_MONTH=3,
 * 
 * DAY_OF_MONTH=12,
 * 
 * DAY_OF_YEAR=132,
 * 
 * DAY_OF_WEEK=4,
 * 
 * DAY_OF_WEEK_IN_MONTH=2,
 * 
 * AM_PM=1,
 * 
 * HOUR=2,
 * 
 * HOUR_OF_DAY=14,
 * 
 * MINUTE=47,
 * 
 * SECOND=16,
 * 
 * MILLISECOND=382,
 * 
 * ZONE_OFFSET=19800000,
 * 
 * DST_OFFSET=0
 * 
 * ]
 **/