class Customer {
    int balance = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        if (balance < amount) {
            System.out.println("Less balance, waiting for deposit..." + balance);
            try {
                wait();
            } catch (Exception e) {
            }
        }
        balance -= amount;
        System.out.println("withdraw completed & remaining balance..." + balance);
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit..." + balance);
        balance += amount;
        System.out.println("deposit completed.." + balance);
        notify();
    }

}

public class InterThreadCommunicationExample {

    public static void main(String[] args) {

        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposit(5000);
            }
        }.start();
    }

}
