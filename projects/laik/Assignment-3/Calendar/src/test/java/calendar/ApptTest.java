/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
      assertFalse(appt0.isOn(14, 9, 2018));
  }
@Test(timeout = 4000)
 public void test01()  throws Throwable  {
	Appt appt1 = new Appt(23, 59, 4, 23, 2018, "Assignment Due", "CS 362 Assignment 2 Due", "laik@gmail.com");
	String string1 = appt1.toString();
	assertFalse(appt1.isRecurring());
	assertEquals("\t23/4/2018 at 11:59pm ,Assignment Due, CS 362 Assignment 2 Due\n", string1);
	assertEquals(0, appt1.getRecurIncrement());
    appt1.setValid();
    assertFalse(appt1.isOn(24, 4, 2018));
}

@Test(timeout = 4000)
public void test02()  throws Throwable  {
	Appt appt1 = new Appt(23, 59, 4, 24, 2018, "Assignment 1 Due", "CS 344 Assignment 1 Due", "laik@gmail.com");
	String string1 = appt1.toString();
	assertTrue(appt1.hasTimeSet());
	assertEquals("laik@gmail.com",appt1.getEmailAddress());
	assertEquals("\t24/4/2018 at 11:59pm ,Assignment 1 Due, CS 344 Assignment 1 Due\n", string1);
	assertEquals(0, appt1.getRecurIncrement());
	appt1.setValid();
	assertFalse(appt1.isOn(24, 4, 2018));
}

@Test(timeout = 4000)
public void test04()  throws Throwable  {
    Appt appt0 = new Appt(15, 30, 14, 9, 2018, "Back to TW", "Time to go back", "GG@gmail.com");
    assertFalse(appt0.isRecurring());
    assertEquals(0, appt0.getRecurIncrement());
    assertTrue(appt0.isOn(14, 9, 2018));
}
@Test(timeout = 4000)
public void test05()  throws Throwable  {
	Appt appt0 = new Appt(0, 0, 1, 1, 1, "Back to TW", "Time to go back", "GG@gmail.com");
	appt0.setValid();
	assertTrue(appt0.getValid());
}
@Test(timeout = 4000)
public void test06()  throws Throwable  {
	Appt appt0 = new Appt(23, 59, 31, 12, 1, "Back to TW", "Time to go back", "GG@gmail.com");
	appt0.setValid();
	assertTrue(appt0.getValid());
}

@Test(timeout = 4000)
public void test07()  throws Throwable  {
	Appt appt0 = new Appt(23, 59, 31, 12, 0, "Back to TW", "Time to go back", "GG@gmail.com");
	appt0.setValid();
	assertFalse(appt0.getValid());
}

@Test(timeout = 4000)
public void test08()  throws Throwable  {
	Appt appt1 = new Appt(11, 59, 4, 24, 2018, "Assignment 1 Due", "CS 344 Assignment 1 Due", "laik@gmail.com");
	String string1 = appt1.toString();
	assertEquals("\t24/4/2018 at 11:59am ,Assignment 1 Due, CS 344 Assignment 1 Due\n", string1);
}


}
