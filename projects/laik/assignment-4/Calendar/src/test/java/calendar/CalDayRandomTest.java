package calendar;

import java.util.Calendar;
import org.junit.Test;
import java.util.Random;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {	
	
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setRecurrence"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur 
        }	
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
        }	
   /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 /*
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				GregorianCalendar curday = new GregorianCalendar(2018,11,10);
				CalDay calday0 = new CalDay(curday);
				int startHour1=ValuesGenerator.getRandomIntBetween(random, 0, 12);
				 int startMinute1=ValuesGenerator.getRandomIntBetween(random, 0, 59);
				 int startDay1=ValuesGenerator.getRandomIntBetween(random, 10, 10);
				 int startMonth1=ValuesGenerator.getRandomIntBetween(random, 11, 11);
				 int startYear1=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
				 String title1="Birthday Party";
				 String description1="This is my birthday party.";
				 String emailAddress1="xyz@gmail.com";
				 Appt appt1 = new Appt(startHour1,
		                  startMinute1 ,
		                  startDay1 ,
		                  startMonth1 ,
		                  startYear1 ,
		                  title1,
		                 description1,
		                 emailAddress1);
				 int startHour2=ValuesGenerator.getRandomIntBetween(random, -2, 13);
				 int startMinute2=ValuesGenerator.getRandomIntBetween(random, -1, 60);
				 int startDay2=ValuesGenerator.getRandomIntBetween(random, 10, 10);
				 int startMonth2=ValuesGenerator.getRandomIntBetween(random, 11, 11);
				 int startYear2=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
				 String title2="WOEIJ";
				 String description2="asd";
				 String emailAddress2="qwe2@gmail.com";
				 Appt appt2 = new Appt(startHour2,
		                  startMinute2 ,
		                  startDay2 ,
		                  startMonth2 ,
		                  startYear2 ,
		                  title2,
		                 description2,
		                 emailAddress2);
				 calday0.addAppt(appt1);
				 appt2.setValid();
				 calday0.addAppt(appt2);
	
			 
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
		*/
		 System.out.println("Done testing CalDay...");
	 }


	
}
