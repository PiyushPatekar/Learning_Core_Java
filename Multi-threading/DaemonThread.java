class MyThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread is running");
        } else {
            System.out.println("User Thread is running");
        }
    }
}

public class DaemonThread {

    public static void main(String[] args) {

        MyThread task1 = new MyThread();
        MyThread task2 = new MyThread();
        task1.setDaemon(false);
        task1.start();
        // task2.start();
    }
}
