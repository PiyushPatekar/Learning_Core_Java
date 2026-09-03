
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


public class Main{
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountHolderName = "Piyush Patekar";
        savingsAccount.balance = 100.0;
        savingsAccount.interestRate = 5.0;
        savingsAccount.deposit(500.0);
    }
}