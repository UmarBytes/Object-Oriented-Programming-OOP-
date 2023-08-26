import java.time.*;
public class First_Last_DayNameOf_Month{
	public static void main(String[] args){
	/*
	#Creat a Method
	Ham is me jis year or Manth ki value put kareen gy usi Month 
	ka First od last Day name pata kr sakth han
	*/ 
	        YearMonth ym = YearMonth.of(2020,10);

	        String FirstDay = ym.atDay(1).getDayOfWeek().name();
	        String LastName = ym.atEndOfMonth().getDayOfWeek().name();

	        System.out.println("First Day of the Month : " + FirstDay);
	        System.out.println("Last day of The Month : " + LastName);

	}
}