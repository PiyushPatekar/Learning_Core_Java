class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
}


public class ThreadExample {
    public static void main(String[] args){

        MyThread t1 = new MyThread();
        t1.start();
        System.out.println(t1.getName());
        // start() is used to create new thread
        // Contian the task that thread executive
        
        MyThread t2 = new MyThread();
        t2.start();
        System.out.println(t2.getName());

        MyThread t3 = new MyThread();
        t3.start();
        System.out.println(t3.getName());


    }
}