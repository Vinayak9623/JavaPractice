package asynch;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ParalelExample {

    static void main() {

        List<Integer> integers = List.of(1, 2, 3, 4,89);

        int result=0;
        for(int n:integers){

            result+=n;
        }
        System.out.println("Result of array is:"+ result);

        CompletableFuture<String> user=CompletableFuture
                .supplyAsync(()->getUser());
        CompletableFuture<String> order=CompletableFuture.supplyAsync(()->getOrders());
        CompletableFuture<String> payments=CompletableFuture.supplyAsync(()->getPayment());

        CompletableFuture.allOf(user,order,payments).join();

        System.out.println(user.join());
        System.out.println(order.join());
        System.out.println(payments.join());
    }

    static String getUser(){
        return "User Data";
    }

    static String getOrders(){
        return "Order Data";
    }

    static String getPayment(){
        return "Payments done";
    }
}
