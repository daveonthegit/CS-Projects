import java.time.*;
import java.time.Month.*;
import java.util.*;
public class APCalendar {
   /** Returns true if year is a leap year and false otherwise. */
   private static boolean isLeapYear(int year)
   {
      
      return Year.of(year).isLeap();
   }
   /** Returns the number of leap years between year1 and year2, inclusive.
   * Precondition: 0 <= year1 <= year2
   */
   public static int numberOfLeapYears(int year1, int year2)
   { 
      int num = 0;
      for (int i = year1; i <=year2;i++) {
         if (isLeapYear(i)) {
            num++;
         }
      }
      return num;
   }
   /** Returns the value representing the day of the week for the first day of year,
   * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
   */
   private static int firstDayOfYear(int year)
   { 
      Calendar c = new GregorianCalendar(year, Calendar.JANUARY, 1);
      int day = c.get(Calendar.DAY_OF_WEEK) -1;
      return day;
   }
   /** Returns n, where month, day, and year specify the nth day of the year.
   * Returns 1 for January 1 (month = 1, day = 1) of any year.
   * Precondition: The date represented by month, day, year is a valid date.
   */
   private static int dayOfYear(int month, int day, int year)
   { int[] nonleap = {31,28,31,30,31,30,31,31,30,31,30,31};
     int[] leap = {31,29,31,30,31,30,31,31,30,31,30,31};
     int tagDesJahres = 0;
     if (isLeapYear(year)) {
         for (int i = 0; i <month-1;i++) {
            tagDesJahres+= leap[i];
         }
     } else {
         for (int i = 0; i <month-1;i++) {
            tagDesJahres+= nonleap[i];
         }
     }
     tagDesJahres+=day;
     return tagDesJahres;
   }
   /** Returns the value representing the day of the week for the given date
   * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
   * and 6 denotes Saturday.
   * Precondition: The date represented by month, day, year is a valid date.
   */
   public static int dayOfWeek(int month, int day, int year)
   { 
      int weekday = 0;
      int fday = firstDayOfYear(year);
      int cday = dayOfYear(month, day, year);
      weekday = (fday+cday)%7-1;
      if (weekday > 6) {
         weekday-=7;
      }
      return weekday;
   }
   // There may be instance variables, constructors, and other methods not shown.
   public static void main(String[] args) {
      System.out.println("Is 2020 a leap year: " + isLeapYear(2020));
      System.out.println("Is 2021 a leap year: " + isLeapYear(2021));
      //Testing method ^
      System.out.println("Number of leap years between 2000, and 2020: " + numberOfLeapYears(2000,2020));
      System.out.println("First day of Year 2021: " + firstDayOfYear(2021));
      System.out.println("nth Day of Year, 1/12/2021: " + dayOfYear(1,12,2021));
      System.out.println("What is the weekday of January 12, 2020: " + dayOfWeek(1,12,2020));
   }
}