class Task1 implements Runnable {
    public void run() {

    }

}

public class ThreadPriority {
    public static void main(String[] args) {
        Task1 task = new Task1();
        Thread t1 = new Thread(task, "FCT - Task1");
        Thread t2 = new Thread(task, "FCT - Task2");
        Thread t3 = new Thread(task, "FCT - Task3");
        Thread t4 = new Thread(task, "FCT - Task4");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());

    }
}