package multiThread;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("I am new and running");
        try {
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getState());
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }

    static void main() throws InterruptedException {
        MyThread myThread =new MyThread();
        State state = myThread.getState();
        System.out.println("new thread state:"+state);
        System.out.println("main thread state:"+Thread.currentThread().getState());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("After running state of new thread: "+myThread.getState());
        myThread.join();
        System.out.println("new thread state after join of new thread: "+ myThread.currentThread().getState());
    }
}
