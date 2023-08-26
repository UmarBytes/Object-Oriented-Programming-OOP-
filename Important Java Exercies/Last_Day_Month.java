/*
QUESTION: Write a Java program to get the last day of the current month 
	we can find Last Month, Last Week, Last Hour, Last Minute, Last Second
	to use this method
*/
import java.util.*;

class Last_Day_Month{
    	public static void main(String[] args) {
        	        Calendar cal = Calendar.getInstance();

                 System.out.println("Last Day of This Month : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}