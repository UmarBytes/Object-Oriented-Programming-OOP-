/*
QUESTION: Write a Java program to calculate the first and last day of each week.
*/

import java.util.*;
import java.text.*;
public class First_Last_DayOf_Week{
	public static void main(String[] args){
	//default calendar
	Calendar cal = Calendar.getInstance();
	     cal.set(Calendar.DAY_OF_WEEK, Calendar.MONTH);
	
	//Dfefault Date Format
	     DateFormat datefor = new SimpleDateFormat("EEE dd/MM/yy");
	     System.out.println(datefor.format(cal.getTime()));
	     
	for(int index = 0; index < 6; index++)
	{

	//Ham 1 ki jaga 2 put kareen gy to Two Weeks ki date aa jaye gi asy hi 3...

	cal.add(Calendar.DATE, 1);
	}
	        System.out.println(datefor.format(cal.getTime()));
	}
}