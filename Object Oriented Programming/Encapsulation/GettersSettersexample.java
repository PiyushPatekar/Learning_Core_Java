class BankAccount{

    private double balance;
    private String accountHolderName;

    // Setter method example
    public void getBalance(double balance){
        this.balance = balance;
    }

    public void getAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter methods example
    public double getBalance() {
        return balance;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if(balance > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposited amount must be positive");
        }
    }
    public void withdraw(double amount) {
        if(balance > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

}


public class GettersSettersexample {
    
     public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.getAccountHolderName("Piyush Patekar");
        account.getBalance(2000);
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

    
    }
}
