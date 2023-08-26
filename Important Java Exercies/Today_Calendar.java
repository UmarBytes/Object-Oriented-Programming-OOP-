/*
Question : Write a Java program to get and display information (year, month, day, hour, minute)
                    of a default calendar
*/
import java.util.*;
public class Today_Calendar{
	public static void main(String[] args){
     //create a default calendar
	Calendar cal = Calendar.getInstance();
     // to get information of crunt Year, Month, date, Hours, Minute, and secounds
	System.out.println("");
		System.out.println("Year   :    "  + cal.get(Calendar.YEAR));
		System.out.println("Month  :    "+ cal.get(Calendar.MONTH));
		System.out.println("Date    :     "+ cal.get(Calendar.DATE));
		System.out.println("Hours   :    " + cal.get(Calendar.HOUR));
		System.out.println("Minutes    :    "+ cal.get(Calendar.MINUTE));
		System.out.println("Secound   : " + cal.get(Calendar.SECOND));
	}
}