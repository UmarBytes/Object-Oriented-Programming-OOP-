import java.util.*;
public class Maximum_Value_OfThe_Year{
	public static void main(String[] args){
	// creat Defolte Calendar
	Calendar cal = Calendar.getInstance();
	
	System.out.println(" ");

		System.out.println("\nCurrent Date and Time : "+ cal.getTime());
	int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
	int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
	int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
	int actualMaxDate	= cal.getActualMaximum(Calendar.DATE);
	
	System.out.println("Actual Maximum Year : " + actualMaxYear);
	System.out.println("Actual Maximum Month : " + actualMaxMonth);
	System.out.println("Actual Maximum Week :  " + actualMaxWeek);
	System.out.println("Actual Maximum Date : " + actualMaxDate);
	}
}