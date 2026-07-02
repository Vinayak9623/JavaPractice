package multiThread;

public class CookingTask extends Thread {

    private String task;

    public CookingTask(String task){
        this.task=task;
    }

    @Override
    public void run() {
        System.out.println("Task perform by thread which name is: "+Thread.currentThread().getName());
    }

    static void main() {

        CookingTask t1=new CookingTask("Chapati");
        CookingTask t2=new CookingTask("Bhaji");
        CookingTask t3=new CookingTask("Batata");

        t1.start();
        t2.start();
        t3.start();
    }
}
