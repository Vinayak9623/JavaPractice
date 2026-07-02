package java8.test;

public class C implements A,B{
    @Override
    public void a() {
        System.out.println("Hello");
    }

    static void main() {
        C c=new C();
        c.a();
    }
}
