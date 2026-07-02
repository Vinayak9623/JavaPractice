package multiThread;

public class Test extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("New thread start "+Thread.currentThread().getName());

    }

    public static void main(String args[]) throws InterruptedException{
        Test thread=new Test();
        thread.start();
        Thread.sleep(100000);
        System.out.println("Main Thread "+ Thread.currentThread().getName());

    }

}
