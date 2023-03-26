public class BankAccount implements Comparable{

	private String name;
	private int accountNum;
	private double balance;

	BankAccount(String n , int a , double b){

		name = n;
		accountNum = a;
		balance = b;
	}

	void display(){

		System.out.println("Name is : " + name + "\nAccount Number: " + accountNum + "\nBalance is : " + balance);

	}

	public int compareTo(Object temp){
		BankAccount bA = (BankAccount) temp;
 	
		if(this.balance > bA.balance){
					return 1;
	}
		else if(this.balance < bA.balance){
					return -1;
	}
		else{
					return 0;
	}
   }

 }