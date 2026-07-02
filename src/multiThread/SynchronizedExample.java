package multiThread;

public class SynchronizedExample{

    static void main() throws InterruptedException{
        Counter counter = new Counter();

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });


        Thread thread1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                  counter.increment();
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println("Final count:"+counter.getCount());
    }
}

 class Counter {
    private int count=0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}


