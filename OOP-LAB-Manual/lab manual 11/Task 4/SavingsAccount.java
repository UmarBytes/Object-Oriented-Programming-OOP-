public class SavingsAccount extends BankAccount{

	private double annualInterestRate;

  	SavingsAccount(){
		super();
		annualInterestRate = 0.0;
  }

  	SavingsAccount(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
  }

  	SavingsAccount(double annualInterestRate , int accountNumber , String accountOwner , double accountBalance){
		super(accountNumber , accountOwner , accountBalance);
		this.annualInterestRate = annualInterestRate;
  }

  	void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
  }

  	double getAnnualInterestRate(){
		return annualInterestRate;
  }

  	
  	void withdrawal(double amount){

	if(getAccountBalance()<amount)
		System.out.println("Withdrawl Failed!!!\nAccount Balance Insufficient...");
	else
	{
		double b = getAccountBalance() - amount;
		setAccountBalance(b);
	}
  }

  	void depositMonthlyInterest(){
		double b = getAccountBalance() + (annualInterestRate/12);
		setAccountBalance(b);
  }

  	
  	void accountStatement(){
		super.accountStatement();
		System.out.println("Annual Interest Rate : " + getAnnualInterestRate());
  }
}