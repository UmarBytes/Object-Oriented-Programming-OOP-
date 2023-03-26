public class UsingAccounts{
	public static void main(String[] args){

		SavingsAccount s = new SavingsAccount();
		SavingsAccount s1 = new SavingsAccount(500);
		SavingsAccount s2 = new SavingsAccount(65 , 567 , "Iqra" , 40000); 		

		CheckingAccount c = new CheckingAccount();
		CheckingAccount c1 = new CheckingAccount(300);
		CheckingAccount c2 = new CheckingAccount(200 , 4637 , "Hamza" , 1000);

		s.accountStatement();
		System.out.println();
		
		s1.accountStatement();
		System.out.println();
	

		s2.accountStatement();
		System.out.println();
	
			

		c.accountStatement();
		System.out.println();
		

		c1.accountStatement();
		System.out.println();
		

		c2.accountStatement();
		System.out.println();
		
		
		System.out.println("Object 3 of Check Class");
		c2.withdrawal(500);
	
		c2.setAccountBalance(c2.getAccountBalance()+1000);
	
		

		s2.depositMonthlyInterest();
		s2.depositMonthlyInterest();
		s2.depositMonthlyInterest();
		s2.withdrawal(1000);
		
		
		
		System.out.println("Object 1 of Checking Account");
		c.accountStatement();
		System.out.println("Object 2 of Checking Account");
		c1.accountStatement();
		System.out.println("Object 3 of Checking Account");
		c2.accountStatement();

		System.out.println("Object 1 of Saving Account");
		s.accountStatement();
		System.out.println("Object 2 of Saving Account");
		s1.accountStatement();
		System.out.println("Object 3 of Saving Account");
		s2.accountStatement();
		
	}
}