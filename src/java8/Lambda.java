package java8;

public class Lambda {

    static void main() {

        beforeJava8();
        afterJava8();
    }

public static void beforeJava8(){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello I am before java8");
            }
        };
        runnable.run();
}

public static void afterJava8(){
        Runnable r=()-> System.out.println("Hello I am after java8");
        r.run();
}
}
