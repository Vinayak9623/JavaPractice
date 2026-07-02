package multiThread;

public class DemoDemonThread extends Thread {

    @Override
    public void run() {
        for(; ;){
            System.out.println("Hello World");
        }
    }

    static void main() {

        DemoDemonThread t1=new DemoDemonThread();

        t1.setDaemon(true);
        t1.start();

        System.out.println("main Thread End");
    }
}
