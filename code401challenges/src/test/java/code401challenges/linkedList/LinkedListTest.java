package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {

    @Test public void testInsert() {
        int[] expectedLL = {1,3,2};
        int expectedLength = expectedLL.length;
        LinkedList actual = new LinkedList();
        assertTrue(actual.isEmpty());

        actual.head = actual.insert(1);
        actual.insert(3);
        actual.insert(2);
        assertEquals(expectedLength, actual.length());
    }

    @Test public void testInclude_tureCase() {
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.head = actualLL.insert(1);
        actualLL.insert(3);
        actualLL.insert(2);

        boolean expected = true;
        boolean actual = actualLL.include(3);

        assertEquals(expected, actual);
    }

    @Test public void testInclude_falseCase() {
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.head = actualLL.insert(1);
        actualLL.insert(3);
        actualLL.insert(2);

        boolean expected = false;
        boolean actual = actualLL.include(4);

        assertEquals(expected, actual);
    }

    @Test public void testToString() {
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.head = actualLL.insert(1);
        actualLL.insert(3);
        actualLL.insert(2);

        String expected = "{ 2 } -> { 3 } -> { 1 } -> NULL";
        String actual = actualLL.toString();

        assertEquals(expected, actual);
    }

}
