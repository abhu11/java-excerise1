import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DateAfterWeek {
   public static void main(String args[]) {
      //Getting the current Date value
      LocalDate currentDate = LocalDate.now();
      System.out.println("Current date: "+currentDate);
      //Adding one week to the current date
      LocalDate result = currentDate.plus(1, ChronoUnit.WEEKS);
      System.out.println("Day after one week: "+result);
   }
}