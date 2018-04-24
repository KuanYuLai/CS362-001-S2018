/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	  	GregorianCalendar curday = new GregorianCalendar(2018,11,10);
	  	CalDay calday0 = new CalDay(curday);
	  	Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	  	calday0.addAppt(appt0);
	  	assertEquals(1, calday0.getSizeAppts());
	  	String string0 = calday0.toString();
	  	assertTrue(calday0.isValid());
	  	String string1 = calday0.getFullInfomrationApp(calday0);
  }

}
