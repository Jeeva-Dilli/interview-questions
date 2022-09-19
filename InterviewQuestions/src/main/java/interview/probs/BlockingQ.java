package interview.probs;

import java.util.LinkedList;
import java.util.List;

public class BlockingQ {
    private List queue = new LinkedList();
    private int limit = 10;
    public BlockingQ(int limit) {
        this.limit = limit;
    }
    public synchronized void enqueue(Object item) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }
    public synchronized Object dequeue() throws InterruptedException {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }
        return this.queue.remove(0);
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQ queue =  new BlockingQ(5);
        for(int i=0;i<5;i++)
        {
            queue.enqueue(i);
        }
        for (int i=0;i<5;i++)
        {
            queue.dequeue();
        }
        System.out.println(queue.toString());
    }
}
