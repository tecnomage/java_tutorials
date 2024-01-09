/**
 * This file contains examples of creating threads in Java using both the Thread class and the Runnable interface.
 * 
 * The MyThread class extends the Thread class and overrides the run() method to define the behavior of the thread.
 * The MyRunnable class implements the Runnable interface and overrides the run() method to define the behavior of the thread.
 */
// Extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running!");
    }
}

// Implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running!");
    }
}
