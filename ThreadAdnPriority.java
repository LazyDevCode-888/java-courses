import java.lang.Thread;

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "is running");
    }
}

public class ThreadAdnPriority {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

        try {

            thread1.join();
            thread2.join();
            thread3.join();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("All Thread are finished");
    }

}