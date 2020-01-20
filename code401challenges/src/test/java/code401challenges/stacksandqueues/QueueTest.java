package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void testEnqueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.peek().value);
        queue.enqueue(2);
        assertNotEquals(2, queue.peek().value);
        queue.enqueue(3);
        assertNotEquals(3, queue.peek().value);
        assertNotNull(queue);
        assertEquals(3, queue.getSize());
    }

    @Test
    public void testDequeue() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.getSize());
        queue.enqueue(2);
        assertEquals(2, queue.getSize());
        queue.enqueue(3);
        assertEquals(3, queue.getSize());

        int actual = (int) queue.dequeue();
        assertEquals(1, actual);
        assertEquals(2, queue.getSize());
        actual = (int) queue.dequeue();
        assertEquals(2, actual);
        assertEquals(1, queue.getSize());
        queue.dequeue();
        assertEquals(0, queue.getSize());
    }

    @Test
    public void testIsEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        assertFalse(queue.isEmpty());
    }
}
