				//Name : Muhammad Umar Farooq
					//ID : 212370006

public class SavingsAccount{
            
            // static method to strore the anual interest Rate for all account holders.
	        public static double annualInterestRate;
            
            // instance varibale to indicating deposit balance
                      	private double savingsBalance;

            // constructor to set interest rate 
	        public SavingsAccount(){
	            annualInterestRate = 0.0;
	            savingsBalance = 0.0;
        }//cons

            // cons
        public SavingsAccount(double annualInterestRate, double savingsBalance){
            
	            this.annualInterestRate = annualInterestRate;
	            this.savingsBalance = savingsBalance;

        }//cons Savings account

            // Returning methos that will Calculate the Monthly interest Rate
	        public double calculateMonthlyInterest(){            
	            double interest_R = ( savingsBalance * annualInterestRate / 12 );
	                savingsBalance = savingsBalance + interest_R;
            return interest_R;
        }// Monthly Interest Rate "Method"

            //Mthod to set anual interset rate in a new Vaule  
        public static void modifyInterestRate(double thisAnualInterestRate) {            
	            annualInterestRate = thisAnualInterestRate;
        }// annualInterestRate 

            // setter to set the Saving balance 
	        public void setSavingsBalance(double current_Balance){
	            savingsBalance = current_Balance;
        }//setSavingBalence
            //getter to get new Saving Balance 
	        public double getSavingsBalance(){
		            return savingsBalance;
        }//getter

            //to get anualInterest Rate
	        public double getAnnualInterestRate(){            
	            return annualInterestRate;

        }//getter
 }//class
