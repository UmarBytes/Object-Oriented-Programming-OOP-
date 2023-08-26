import java.util.*;
public class Time_In_NewYork{
   public static void main(String[] args){
	//Creat Default Calendar
             Calendar calNewYork = Calendar.getInstance();
	//set Time Zone
	        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	        System.out.println("Time in New York : " + calNewYork.get(Calendar.HOUR) + " : " 
		+ calNewYork.get(Calendar.MINUTE) + " : " + calNewYork.get(Calendar.SECOND));

    }
}
    
