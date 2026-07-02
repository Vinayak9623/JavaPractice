package asynch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterService {

    static void main() {



        Thread thread = new Thread(() -> System.out.println("new Threas is start"+Thread.currentThread()));
        thread.start();

        ExecutorService executorService= Executors.newFixedThreadPool(3);

        Future<?> future = executorService.submit(() -> System.out.println("executer service start"));

    }
}