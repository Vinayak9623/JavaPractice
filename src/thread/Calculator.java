package thread;

public class Calculator {

    static void main() {
        Calculator calculator =new Calculator();
    }

    public int add(int a, int b){
         int c=a+b;
         return c;
    }

    public int multi(int n, int m){
        int i = n * m;
        return i;
    }

public int sustitute(int a, int b){
    int i = a - b;
    return i;
}



}
