interface AccountOperation {

    void deposit(double amount);
    
}

interface LoanOperation {

    void applyLoan(double amount);

}

class SmartAccount implements AccountOperation, LoanOperation {
    private double balance;
    String accountHolderName;

    public SmartAccount(double balance, String accountHolderName){
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    @Override 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + "New Balance: " + balance);
        } else {
            System.out.println("Deposit amount cannot be zero.");
        }
    }

    @Override 
    public void applyLoan(double amount){
        if(amount > 0 ) {
            balance += amount;
            System.out.println("Loan: " + amount + "New Balance: " + balance);
        } else {
            System.out.println("Load amount cannot be zero.");
        }
    }
}


public class Multipleinheritance {

    public static void main(String[] args) {
        
        SmartAccount account = new SmartAccount(5000, "Piyush Patekar");
        account.deposit(500);
        account.applyLoan(120000);
  }
}