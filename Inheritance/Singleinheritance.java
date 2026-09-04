/* 
  We can take Account as a base class with common functionality like deposit.
    Then multiple classes like:
    * SavingsAccount
    * CurrentAccount inherit from Account.

    Each child class adds its own specific behavior.
    This avolds duplication and provides reusability.
 */
//Base class
class Account{
    String accountHolderName;
    double balance;
    
    void deposit(double amount){
        // balance = balance + amount;
        balance += amount;
        System.out.println("Deposited: " + amount + "New balance: " + balance);

    }
}

//Derived class
class SavingsAccount extends Account{
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + " New balance: " + balance);
    }
}


public class Singleinheritance{
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountHolderName = "Piyush Patekar";
        savingsAccount.balance = 100.0;
        savingsAccount.interestRate = 5.0;
        savingsAccount.deposit(500.0);
    }
}