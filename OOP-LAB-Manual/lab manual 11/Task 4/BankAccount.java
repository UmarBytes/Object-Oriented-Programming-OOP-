public class BankAccount{

	private int accountNumber;
	private String accountOwner;
	private double accountBalance;

  	BankAccount(){
		accountNumber = 0;
		accountOwner = "null";
		accountBalance = 0.0;
  }

  	BankAccount(int accountNumber , String accountOwner , double accountBalance){

		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.accountBalance = accountBalance;
  }

  	void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
  }

  	void setAccountOwner(String accountOwner){
		this.accountOwner = accountOwner;
  }

  	void setAccountBalance(double accountBalance){
		this.accountBalance = accountBalance;
  }

  	int getAccountNumber(){
		return accountNumber;
  }

  	String getAccountOwner(){
		return accountOwner;
  }

  	double getAccountBalance(){
		return accountBalance;
  }

  	void accountStatement(){

		System.out.println("\nAccount Number : " + getAccountNumber());
		System.out.println("Account Owner : " + getAccountOwner());
		System.out.println("Account Balance : " + getAccountBalance());
  }

  	void deposit(double amount){
		accountBalance += amount;
  }

  	void withdrawal(double amount){
		accountBalance -= amount;
  }
}