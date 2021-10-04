// Public Account Class
public class Account {
	
    private int id = 0;                              // default value is 0
    private double balance = 0.0;                    // default value is 0
    private static double annualInterestRate = 0.0;  // default value is 0
    private java.util.Date dateCreated;              // Store Date when Account is created

    // Non-argument constructor that creates a default account
    public Account() {
        dateCreated = new java.util.Date();
    }

    // Constructor that creates an account with the specified id and initial balance.
    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }

    // Accessor and mutator methods for id, balance, and annualInterestRate.
    
    // For Id
    public int getId() {
        return this.id;
    }

    // For Balance
    public double getBalance() {
        return this.balance;
    }

    // For Annual Interest Rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Accessor method for dateCreated.
    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // getMonthlyInterestRate() Method that returns the monthly interest rate.
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;  // Formula: annualInterestRate(in %) / 12. 
    }

    // getMonthlyInterest() Method that returns the monthly interest.
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // withdraw Method that withdraws a specified amount from the account.
    public void withdraw(double amount) {
        this.balance -= amount;  // Formula: balance - amount
    }

    // deposit Method that deposits a specified amount to the account.
    public void deposit(double amount) {
        this.balance += amount;  // Formula: balance + amount
    }
}