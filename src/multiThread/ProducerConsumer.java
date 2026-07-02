package multiThread;

public class ProducerConsumer{

    static void main() throws InterruptedException {
        DemoProducerConsumer demoProducerConsumer =new DemoProducerConsumer();

        Runnable produce=()->{
            int i=100;
            while (true){
                demoProducerConsumer.producer(i++);
            }
        };

        new Thread(produce,"producer_thread_veer").start();


        Runnable consumer=()->{
            while (true){
                demoProducerConsumer.consumer();
            }
        };

    }

}
