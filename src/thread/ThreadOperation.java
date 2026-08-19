package thread;

public class ThreadOperation extends Thread{

    public void run(){
        System.out.println("Thread"+Thread.currentThread().getName()+" is running");
    }

    static void main() {
        for(int i=0;i<8;i++){
            ThreadOperation threadOperation =new ThreadOperation();
            threadOperation.start();
        }
    }
}
