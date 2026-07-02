package multiThread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class DemoProducerConsumer{
  private Queue<Integer> queue;

    public DemoProducerConsumer(){
        this.queue=new LinkedList<>();
    }


    public void producer(int n){
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(3));
            boolean add = queue.add(n);
            System.out.println(n+" :"+Thread.currentThread().getName()+"message produced");
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }


    }

    public synchronized void consumer(){
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            Integer peek = queue.poll();
            System.out.println(peek+":"+Thread.currentThread().getName());
        }
        catch (InterruptedException ex){
            ex.getMessage();
        }


    }

}


