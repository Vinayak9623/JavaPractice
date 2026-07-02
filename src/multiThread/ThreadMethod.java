package multiThread;

public class ThreadMethod extends Thread {

    @Override
    public void run() {
       // System.out.println("I am new thread");

        for(int i=0;i<10;i++){
            System.out.println("Thread name is :"+Thread.currentThread().getName()+":"+i);
            //Thread.yield();
        }
    }

    static void main() throws InterruptedException {
       ThreadMethod t1 =new ThreadMethod();
       ThreadMethod t2=new ThreadMethod();
       t1.start();
       t2.start();
//        System.out.println(Thread.currentThread().getState());

    }
}
