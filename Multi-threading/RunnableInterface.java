class Task1 implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable");
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Task1 obj = new Task1();
        Thread t1 = new Thread(obj, "FCT - Piyush");
        t1.start();
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getName());

    }
}