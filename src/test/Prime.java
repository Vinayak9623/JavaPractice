package test;

import java.util.stream.IntStream;

public class Prime {

    static void main() {
        int n=28;
        boolean result=primeNumberWithTradditionalWay(n);
        System.out.println(result);
        System.out.println(findprimeWithJava8(n));

    }

    public static boolean primeNumberWithTradditionalWay(int n){
        if(n<1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }

    public static boolean findprimeWithJava8(int n){
        return IntStream.range(2,n).noneMatch(x->n%x==0);
    }
}
