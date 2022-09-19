package interview.probs;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQ {
    public static void main(String[] args) {

        BlockingQueue queue = new ArrayBlockingQueue(3);

        ProducerQ producer = new ProducerQ(queue);
        ConsumerQ consumer = new ConsumerQ(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class ProducerQ implements Runnable
{
    protected BlockingQueue queue=null;

    public ProducerQ (BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
            queue.put("4");
            Thread.sleep(1000);
            queue.put("5");
            Thread.sleep(1000);
            queue.put("8");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class ConsumerQ implements Runnable
{
    protected BlockingQueue queue=null;

    public ConsumerQ (BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
