import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        System.err.println("Hello from the main thread!");
        // Using Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Using Runnable interface
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

    }
}