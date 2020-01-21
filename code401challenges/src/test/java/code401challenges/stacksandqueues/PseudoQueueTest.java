package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest {
    @Test
    public void testEnqueueDequeue() {
        PseudoQueue<Integer> actual_queue = new PseudoQueue<>();
        actual_queue.enqueue(5);
        actual_queue.enqueue(10);
        actual_queue.enqueue(15);
        actual_queue.enqueue(20);

        assertEquals((Integer)5, actual_queue.dequeue());
    }

    @Test
    public void testEnqueueDequeue_emptyQueue() {
        PseudoQueue<Integer> actual_queue = new PseudoQueue<>();
        actual_queue.enqueue(5);

        assertEquals((Integer)5, actual_queue.dequeue());
    }

    @Test
    public void testEnqueueDequeue_shuffle() {
        PseudoQueue<Integer> actual_queue = new PseudoQueue<>();
        actual_queue.enqueue(5);
        actual_queue.dequeue();
        actual_queue.enqueue(10);
        actual_queue.dequeue();
        actual_queue.enqueue(15);
        actual_queue.dequeue();
        actual_queue.enqueue(20);

        assertEquals((Integer)20, actual_queue.dequeue());
    }
}
