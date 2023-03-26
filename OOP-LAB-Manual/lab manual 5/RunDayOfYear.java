public class RunDayOfYear{
  public static void main(String[] args){

	DayOfYear today = new DayOfYear();
	DayOfYear birthday = new DayOfYear();

	System.out.println("\nEnter today's date...");
	today.input();
	System.out.print("\nToday's date");
	today.output();

	System.out.println("\nEnter birthday month...");
	birthday.input();
	System.out.print("\nAli's birthday");
	birthday.output();
	
	System.out.println("Happy Birthday Ali!");
  }
}