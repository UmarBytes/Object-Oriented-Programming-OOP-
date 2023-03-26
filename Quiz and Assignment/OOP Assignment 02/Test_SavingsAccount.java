
						//Name : Muhammad Umar Farooq
						//ID : 212370006

public class Test_SavingsAccount{

        public static void main(String[] args){
                // Objests of blueprint class
            SavingsAccount saver1 = new SavingsAccount();
            SavingsAccount saver2 = new SavingsAccount();

            saver1.setSavingsBalance(2000.0);
            saver2.setSavingsBalance(3000.0);
            
        	    SavingsAccount.modifyInterestRate(0.04);
              System.out.println("\n Sacver 1 for 4 % interest  rate --------------- --------------\n");
            	for (int i = 0; i< 12 ; i++){
            	    saver1.calculateMonthlyInterest();
            	        System.out.println("Balance in the account of Saver1 on interest rate of 4% for Each Month :  " + saver1.getSavingsBalance());        
            }//for
               System.out.println("\n Sacver 2 for 4 % interest  rate --------------- ---------------\n");
            		for (int j = 0; j < 12 ; j++){
  	              saver2.calculateMonthlyInterest();    
                    	System.out.println("Balance in the account of saver2 on interest rate of 4% for Each month :  " + saver2.getSavingsBalance());
            }//for
       	 SavingsAccount.modifyInterestRate(0.05);
           System.out.println("\n Sacver 1 for 5 % interest  rate --------------- --------------\n");
   	         for (int k = 0; k < 12; k++){
   	             saver1.calculateMonthlyInterest();
                    System.out.println("New Balance in the account of Saver1 for interest rate of 5%:  " + saver1.getSavingsBalance());                        
            }//for
        System.out.println("\n Sacver 2 for 4 % interest  rate --------------- ---------------\n");
	            for (int l = 0; l < 12; l++){
	                saver2.calculateMonthlyInterest();
                    System.out.println("New Balance in the account of saver2 for interest rate of 5%:  " + saver2.getSavingsBalance());    
            }//for
   //	annual interest Rate
   //NOTE:   I just wrote it just because, I am little bit confuse to fulfil the demand of the question. so you can ignore if.
	        SavingsAccount.modifyInterestRate(0.04);
	            saver1.calculateMonthlyInterest();
	            saver2.calculateMonthlyInterest();

	                System.out.println("\n");

	            System.out.println("New Balance in the account of Saver1 for interest rate of 4%  :  " + saver1.getSavingsBalance());
	            System.out.println("New Balance in the account of saver2 for interest rate of 4%  :  " + saver2.getSavingsBalance());

	               System.out.println("\n");

	        SavingsAccount.modifyInterestRate(0.05);

	            saver1.calculateMonthlyInterest();
	            saver2.calculateMonthlyInterest();

	            System.out.println("New Balance in the account of Saver1 for interest rate of 5%:  " + saver1.getSavingsBalance());
	            System.out.println("New Balance in the account of saver2 for interest rate of 5%:  " + saver2.getSavingsBalance());

        }//mian
    }//class