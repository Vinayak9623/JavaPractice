package multiThread;

public class CookingJob implements Runnable{

    String task;

    public CookingJob(String task){
        this.task=task;
    }
    @Override
    public void run() {
        System.out.println("Task perform by thered with name:"+Thread.currentThread().getName());
    }

    static void main() {
        Thread t1=new Thread(new CookingJob("Chapati"));
        Thread t2=new Thread(new CookingJob("Sabji"));
        Thread t3=new Thread(new CookingJob("Roti"));

        t1.start();
        t2.start();
        t3.start();
    }
}
