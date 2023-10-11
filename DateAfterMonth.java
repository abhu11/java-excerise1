
import java.time.LocalDate;

//Example to Add months to a Date
public class DateAfterMonth {  
	public static void main(String[] args){  
		
		// Take a date
	    LocalDate date = LocalDate.now();
		// Displaying date
		System.out.println("Date : "+date);
		// Add 1 month to the date
		LocalDate newDate = date.plusMonths(1); 
		System.out.println("New Date : "+newDate);
	}
}