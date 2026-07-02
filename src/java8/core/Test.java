package java8.core;

public class Test {

      static int count=0;

     public Test(){count++;}

    public static void main(String args[]){
         Test t1=new Test();
         Test t2=new Test();
         Test t3=new Test();

        System.out.println(Test.count);
    }
}
