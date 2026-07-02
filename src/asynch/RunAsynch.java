package asynch;

import java.util.concurrent.CompletableFuture;

public class RunAsynch {

    static void main() {

//        CompletableFuture.runAsync(()->{
//            System.out.println("Background task running");
//        });
//        System.out.println("this is main Thread");


//        CompletableFuture<String> future=CompletableFuture.supplyAsync(()->{
//            return "Background task is running";
//        });
//        String result = future.join();
//        System.out.println(result);

        CompletableFuture<Integer> future=CompletableFuture.supplyAsync(()->10)
                .thenApply(n->n*2);

        Integer result = future.join();
        System.out.println(result);

        System.out.println("I am free ");
    }
}
