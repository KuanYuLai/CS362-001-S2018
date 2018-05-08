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
	  	Appt appt1 = new Appt(12, 10, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	  	calday0.addAppt(appt0);
	  	calday0.addAppt(appt1);
	  	assertEquals(2, calday0.getSizeAppts());
	  	assertTrue(calday0.isValid());
	  	String string1 = calday0.getFullInfomrationApp(calday0);
	  	assertEquals("12-10-2018 \n\t0:10AM Birthday Party This is my birthday party \n\t3:30PM Birthday Party This is my birthday party ", string1);
  }
  
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
	  	GregorianCalendar curday = new GregorianCalendar(2018,11,10);
	  	CalDay calday0 = new CalDay(curday);
	  	Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	  	calday0.addAppt(appt0);
	  	String string0 = calday0.toString();
	  	assertEquals("\t --- 13/10/2018 --- \n --- -------- Appointments ------------ --- \n\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n \n",string0);
  }

}
