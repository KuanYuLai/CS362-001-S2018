
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	  DataHandler dh = new DataHandler();
	  Appt appt0 = new Appt(15, 30, 14, 9, 2018, "Back to TW", "Time to go back", "GG@gmail.com");
	  Appt appt1 = new Appt(15, 30, 14, 10, 2018, "Back to TW", "Time to go back", "GG@gmail.com");
	  dh.saveAppt(appt0);
	  dh.saveAppt(appt1);
	  GregorianCalendar first = new GregorianCalendar(2018,11,10);
	  GregorianCalendar last = new GregorianCalendar(2018,12,10);
	  dh.getApptRange(first, last);
	  dh.deleteAppt(appt0);
  }

}
