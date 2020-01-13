package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {

    @Test public void testInsert() {
        int[] expectedLL = {1,3,2};
        int expectedLength = expectedLL.length;
        LinkedList actual = new LinkedList();
        actual.head = actual.insert(1);
        actual.insert(3);
        actual.insert(2);
        assertEquals(expectedLength, actual.length());
    }

}
