/*
QUESTION :  Write a Java program to get the minimum value 
of year, month, week, date from the current date of a default calendar.
*/
import java.util.*;
public class Min_Value_Of_Year{
	public static void main(String[] args){
      //creat defolt Calendar
	Calendar cal = Calendar.getInstance();

	System.out.println("Current Date and Time : "+ cal.getTime());
	
	int actualMinYear = cal.getActualMinimum(Calendar.YEAR);
	int actualMinMonth = cal.getActualMinimum(Calendar.MONTH); 
	int actualMinWeek =  cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
	int actualMinDate =  cal.getActualMinimum(Calendar.DATE);

		System.out.println("Actual Minimum Year : " + actualMinYear);
		System.out.println("Actual Minimum Month : " + actualMinMonth);
		System.out.println("Actual Minimum Week : " + actualMinWeek);
		System.out.println("Actual Minimum Date : " + actualMinDate);

	}
}