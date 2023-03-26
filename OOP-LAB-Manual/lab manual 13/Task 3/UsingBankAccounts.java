public class UsingBankAccounts{

	public static void main(String[] args){

	BankAccount b = new BankAccount("Ameer" , 4 , 900);
	BankAccount b1 = new BankAccount("Hadi" , 3 , 850);

	System.out.println(b.compareTo(b1));
	
	}
 }