package java8.recurssion;

public class Demo {

    static void main() {

        int factorial = factorial(5);
        System.out.println("Factorial of 5 using recurssion : "+ factorial);
    }

    public static int factorial(int n){
        //addition of priviousd 2 number is fact
        if(n==0 || n==1)return 1;
        return n* factorial(n-1);
    }
}
