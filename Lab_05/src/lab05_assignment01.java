// Test Program
public class lab05_assignment01 {

	public static void main(String[] args) {
		
		// creates an Account object with an account ID of 1122 and a balance of $20,000
        Account account = new Account(1122, 20000);      // ( ID: 1122, Balance: 20,000)
        
        // an Annual interest rate of 4.5%
        account.setAnnualInterestRate(4.5);
        
        // withdraw method to withdraw $2,500
        System.out.println("\nWithdrawing $2,500...");
        account.withdraw(2500.0);
        
        // deposit method to deposit $3,000
        System.out.println("\nDepositing $3,000...");
        account.deposit(3000.0);
        
        // print the balance, the monthly interest, and the date when this account was created
        System.out.println("\nDisplaying updated info.");
        System.out.println("\nAccount ID : " + account.getId());
        System.out.println("Account Balance : " + account.getBalance());
        System.out.println("Monthly interest rate : " + account.getMonthlyInterestRate());
        System.out.println("Date account was created : " + account.getDateCreated());
    }
}
