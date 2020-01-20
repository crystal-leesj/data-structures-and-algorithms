package code401challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertNotNull;

public class StackTest {
    @Test
    public void testPush() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.peek().value);
        stack.push(2);
        assertEquals(2, stack.peek().value);
        stack.push(3);
        assertEquals(3, stack.peek().value);
        assertNotNull(stack);
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek().value);
        assertNotNull(stack);

        int actual = (int) stack.pop();
        assertEquals(3, actual);
        assertEquals(2, stack.peek().value);
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertEquals(1, stack.peek().value);
        assertNotNull(stack);
        assertFalse(stack.isEmpty());
        stack.push(2);
        assertEquals(2, stack.peek().value);
        assertEquals(1, stack.peek().next.value);
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertEquals(1, stack.peek().value);
        assertNotNull(stack);
        assertFalse(stack.isEmpty());
    }
}
