package multiThread;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

public class ThreadPoolExample {

    static void main() throws InterruptedException{
        ExecutorService executerService= Executors.newFixedThreadPool(5);

        for(int i=0;i<5;i++){
            final int task=i;
            executerService.execute(()->{
                System.out.println("Executor task"+": "+task+": "+Thread.currentThread().getName());
            });
        }

        executerService.shutdown();
    }
}
