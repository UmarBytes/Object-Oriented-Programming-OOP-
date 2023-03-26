public class CheckingAccount extends BankAccount{

	private double insuficientFundsFee;

  	CheckingAccount(){
		super();
		insuficientFundsFee = 0.0;
  }

  	CheckingAccount(double insuficientFundsFee){
		this.insuficientFundsFee = insuficientFundsFee;
  }

  	CheckingAccount(double insuficientFundsFee , int accountNumber , String accountOwner , double accountBalance){
		super(accountNumber , accountOwner , accountBalance);
		this.insuficientFundsFee = insuficientFundsFee;
  }

  	void setInsuficientFundsFee(double insuficientFundsFee){
		this.insuficientFundsFee = insuficientFundsFee;
  }

  	double getInsuficientFundsFee(){
		return insuficientFundsFee;
  }
  	
  	void withdrawal(double amount){

	if(getAccountBalance() <= amount)
	{
		super.withdrawal(insuficientFundsFee);
		System.out.println("Balance is insufficient . And charged a fine of : " + getInsuficientFundsFee());
	}
	else
	{
		super.withdrawal(amount);
	}
  }

  	
  	void accountStatement(){
		super.accountStatement();
  }
}