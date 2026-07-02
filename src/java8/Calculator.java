package java8;
@FunctionalInterface
public interface Calculator {
    int add(int a, int b);
}

class main{

    static void main() {

        Calculator calculator=(a,b)->a*b;
        System.out.println(calculator.add(2,4));
    }

//    @Override
//    public int add(int a, int b) {
//        return a*b;
//    }
}