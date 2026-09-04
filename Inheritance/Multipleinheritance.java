
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

//Multiple class
class PremiumSavingsAccount extends SavingsAccount{
    double premiumInterestRate;

    void extraInterest() {
        double interest = balance * premiumInterestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + " New balance: " + balance);

    }
}


public class Multipleinheritance{
    public static void main(String[] args) {
        
        // SavingsAccount savingsAccount = new SavingsAccount();
        // savingsAccount.accountHolderName = "Piyush Patekar";
        // savingsAccount.balance = 100.0;
        // savingsAccount.interestRate = 5.0;
        // savingsAccount.deposit(500.0);

        // PremiumSavingsAccount premiumSavingsAccount = new PremiumSavingsAccount();
        // premiumSavingsAccount.accountHolderName = "Piyush Patekar";
        // premiumSavingsAccount.balance = 100.0;
        // premiumSavingsAccount.premiumInterestRate = 3.0;
        // premiumSavingsAccount.deposit(500.0);
        // premiumSavingsAccount.extraInterest();

        // PremiumSavingsAccount premiumSavingsAccount1 = new PremiumSavingsAccount();
        // premiumSavingsAccount1.extraInterest();
        // premiumSavingsAccount1.accountHolderName = "sai";
        // premiumSavingsAccount1.balance = 100.0;
        // premiumSavingsAccount1.premiumInterestRate = 3.0;
        // premiumSavingsAccount1.deposit(500.0);
        

        SavingsAccount savingsAccount2 = new SavingsAccount();
        savingsAccount2.accountHolderName = "Akshada";
        savingsAccount2.balance = 0.0;
        savingsAccount2.interestRate = 5.0;
        savingsAccount2.deposit(500);
        savingsAccount2.applyInterest();

        PremiumSavingsAccount premiumSavingsAccount1 = new PremiumSavingsAccount();
        premiumSavingsAccount1.premiumInterestRate = 3.0;
        premiumSavingsAccount1.deposit(500);
        premiumSavingsAccount1.extraInterest();
    }
}