package multiThread;

import java.util.concurrent.TimeUnit;

public class Counters extends Thread {

    private int count;

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

    static void main() {

        Counters counters=new Counters();
     Thread t=new Thread(()->{
         for(int i=0;i<10;i++){
             counters.increment();
         }
     });

     Thread t1=new Thread(()->{
        for(int i=10;i<20;i++){
            counters.increment();
        }
     });

     t.start();
     t1.start();

     try{

         Thread.sleep(TimeUnit.SECONDS.toMillis(10));

         System.out.println("Now All thread should run I am sleeping: "+Thread.currentThread().getName());
//         t.join();
//         t1.join();
     }
     catch (Exception ex){
         ex.getMessage();
     }


        System.out.println(counters.getCount());
    }
}
