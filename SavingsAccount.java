public class SavingsAccount extends BankAccount {

   //instance variables
   private double rate;
   private int savingsNumber=-1;
   private String accountNumber;

   public SavingsAccount(String name, double initialBalance) 
   {
       super(name, initialBalance);
       accountNumber = "";
       rate = 2.5;
   }

   public SavingsAccount(BankAccount oldAccount, double amount) 
   {
       super(oldAccount, amount);
       savingsNumber+=1;
   }

   //method postInterest
   public void postInterest() 
   {
	 rate = (rate/100)/12;
	 setBalance((getBalance()*rate)+getBalance());   
   }

   //override account number
   @Override
   public String getAccountNumber() 
   {
	   savingsNumber+=1;
	   accountNumber = super.getAccountNumber()+"-"+savingsNumber;

       return accountNumber;
   }

}