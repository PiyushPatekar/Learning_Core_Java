class task extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            // System.out.println(i);
            System.out.println(Thread.currentThread().getName() + " running " + i);
        }
    }
}

public class ThreadSchedular {
    public static void main(String[] args) {

        task obj = new task();
        Thread t1 = new Thread(obj, "Piyush");
        Thread t2 = new Thread(obj, "Akshada");
        t1.start();
        t2.start();
    }
}
