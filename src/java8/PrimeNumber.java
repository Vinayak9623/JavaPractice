package java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumber {

    static void main() {
        primeNumber(25);
        primeWithJava(25);
        pri(25);

        System.out.println(isPrime(25));
    }

    public static void primeNumber(int n){

        if(n<2){
            System.out.println(n+": is not a prime");
            return;
        }
        else {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println(n+": is not a prime");
                    return;
                }
            }
            System.out.println(n+": is a prime");
        }

    }

    public static void primeWithJava(int n){
        boolean b = IntStream.range(2, n).noneMatch(x -> n % x == 0);
        if(b) System.out.println(n+": is a prime");
        else System.out.println(n+": is not a prime");
    }


    public static boolean isPrime(int n){
        return IntStream.range(2,n).noneMatch(x->n%x==0);
    }

    public static void pri(int number){
        if(number<2){
            System.out.println(number +": is not prime");
            return;
        }
        else {
            for(int i=2;i<number;i++){
                if(number%i==0){
                    System.out.println(number+": is not prime");
                    return;
                }
            }
            System.out.println(number+": is a prime");
        }
    }

}


