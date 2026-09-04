//base class
class Account{
    String accountHolderName;
    double balance;
    
    void deposit(double amount){
        // balance = balance + amount;
        balance += amount;
        System.out.println("Deposited: " + amount + "New balance: " + balance);

    }
}

//Derived class 1
class SavingsAccount extends Account{
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + " New balance: " + balance);
    }
}

//Derived class 2
class CurrentAccount extends Account{
    double overdraftlimit;

    void withdraw(double amount){
        if(balance + overdraftlimit >= amount) {
            //balance = balance - amount
            balance -= amount; 
            System.out.println("Withdraw: " + amount + "New balance: " + balance);
        } else {
            System.out.println("Withdrawl denied. Overdraft limit exceeded.");
        }
    }
}


public class Hierarchicalinheritance {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountHolderName = "Akshada";
        savingsAccount.balance = 100.0;
        savingsAccount.interestRate = 5.0;
        savingsAccount.deposit(500);
        savingsAccount.applyInterest();

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.accountHolderName = "Piyush";
        currentAccount.balance = 1000.0;
        currentAccount.overdraftlimit = 500.0;
        currentAccount.deposit(500);
        currentAccount.withdraw(1800);


    }
}
