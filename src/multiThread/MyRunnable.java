package multiThread;

public class MyRunnable implements Runnable {

    static void main() {
        Thread thread=new Thread(new MyRunnable());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        System.out.println("Thread start with main method"+Thread
                .currentThread().getName());
        System.out.println(thread.getState());
    }

    @Override
    public void run() {
        System.out.println("Thread start with Runnable interface"+Thread
                .currentThread().getName());
        System.out.println(Thread.currentThread().getState());
    }
}
