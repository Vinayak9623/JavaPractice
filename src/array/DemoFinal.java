package array;

public class DemoFinal {

    static void main() {
        print(null);


    }

    public static void print(String message){
        System.out.println("String print");
    }

    public static void print(Object message){
        System.out.println("Object print");
    }

    public static void calculate(int x){
        System.out.println("primitive call");
    }
    public static void calculate(Integer x){
        System.out.println("wrapper  call");
    }
}
