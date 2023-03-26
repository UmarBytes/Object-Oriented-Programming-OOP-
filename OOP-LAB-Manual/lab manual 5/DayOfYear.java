import java.util.Scanner;
public class DayOfYear{

	private int day;
	private int month;

  	void input(){

	Scanner in = new Scanner(System.in);

	System.out.print("Enter the month as a number : ");
	int d = in.nextInt();

	System.out.print("Enter the day of the month : ");
	int m = in.nextInt();

	set(d , m);

  	}

 	 void output(){

	System.out.println(" is month = " + getMonth() + ", day = " + getDay());
  }

  void set(int d, int m){

	day = d;
	month = m;
  }

    int getMonth(){

	return month;
  }

  int getDay(){

	return day;
  }
}