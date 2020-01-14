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

        assertTrue(actualLL.include(3));
    }

    @Test public void testInclude_falseCase() {
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.head = actualLL.insert(1);
        actualLL.insert(3);
        actualLL.insert(2);

        assertFalse(actualLL.include(4));
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

    @Test public void testAppend_withValues() {
        int[] expectedLL = {1,3,2};
        int expectedLength = expectedLL.length;
        LinkedList actual = new LinkedList();
        assertTrue(actual.isEmpty());

        actual.append(1);
        assertEquals(true, actual.include(1));

        actual.append(3);
        actual.append(2);
        assertEquals(expectedLength, actual.length());
    }

    @Test public void testAppend_withOneValue() {
        int[] expectedLL = {1};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        assertTrue(actualLL.include(1));

        assertEquals(expectedLength, actualLL.length());

        assertNull(actualLL.head.next);
    }

    @Test public void testInsertBefore_insertMiddle() {
        int[] expectedLL = {1,5,3,2};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(3);
        actualLL.append(2);

        int targetVal = 3;
        int newVal = 5;
        actualLL.insertBefore(targetVal, newVal);
        assertEquals(expectedLength, actualLL.length());

        assertTrue(actualLL.include(newVal));
        assertTrue(actualLL.include(targetVal));
    }

    @Test public void testInsertBefore_insertFront() {
        int[] expectedLL = {5,1,3,2};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(3);
        actualLL.append(2);

        int targetVal = 1;
        int newVal = 5;
        actualLL.insertBefore(targetVal, newVal);
//        System.out.println("actualLL = " + actualLL.toString());

        assertEquals(expectedLength, actualLL.length());
        assertTrue(actualLL.include(newVal));
        assertTrue(actualLL.include(targetVal));
    }

    @Test public void testInsertBefore_sameValues() {
        int[] expectedLL = {1,5,2,2};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(2);
        actualLL.append(2);

        int targetVal = 2;
        int newVal = 5;
        actualLL.insertBefore(targetVal, newVal);
//        System.out.println("actualLL = " + actualLL.toString());

        assertEquals(expectedLength, actualLL.length());
        assertTrue(actualLL.include(newVal));
        assertTrue(actualLL.include(targetVal));
    }

    // out of range input will return the original LL
    @Test public void testInsertBefore_notExisting() {
        int[] expectedLL = {1,3,2};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(3);
        actualLL.append(2);

        int targetVal = 4;
        int newVal = 5;
        actualLL.insertBefore(targetVal, newVal);
//        System.out.println("actualLL = " + actualLL.toString());

        assertEquals(expectedLength, actualLL.length());
        assertFalse(actualLL.include(newVal));
        assertFalse(actualLL.include(targetVal));
    }

    @Test public void testInsertBefore_insertBack() {
        int[] expectedLL = {1,3,2,5};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(3);
        actualLL.append(2);

        int targetVal = 2;
        int newVal = 5;
        actualLL.insertBefore(targetVal, newVal);
//        System.out.println("actualLL = " + actualLL.toString());

        assertEquals(expectedLength, actualLL.length());
        assertTrue(actualLL.include(newVal));
        assertTrue(actualLL.include(targetVal));
    }

    @Test public void testInsertAfter_insertMiddle() {
        int[] expectedLL = {1,3,5,2};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(3);
        actualLL.append(2);

        int targetVal = 3;
        int newVal = 5;
        actualLL.insertAfter(targetVal, newVal);
//        System.out.println("actualLL = " + actualLL.toString());

        assertEquals(expectedLength, actualLL.length());
        assertTrue(actualLL.include(newVal));
        assertTrue(actualLL.include(targetVal));
    }

    @Test public void testInsertAfter_insertBack() {
        int[] expectedLL = {1,3,2,5};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(3);
        actualLL.append(2);

        int targetVal = 1;
        int newVal = 5;
        actualLL.insertAfter(targetVal, newVal);

        assertEquals(expectedLength, actualLL.length());
        assertTrue(actualLL.include(newVal));
        assertTrue(actualLL.include(targetVal));
    }

    @Test public void testInsertAfter_sameValues() {
        int[] expectedLL = {1,2,5,2};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(2);
        actualLL.append(2);

        int targetVal = 2;
        int newVal = 5;
        actualLL.insertAfter(targetVal, newVal);
//        System.out.println("actualLL = " + actualLL.toString());

        assertEquals(expectedLength, actualLL.length());
        assertTrue(actualLL.include(newVal));
        assertTrue(actualLL.include(targetVal));
    }

    // out of range input will return the original LL
    @Test public void testInsertAfter_notExisting() {
        int[] expectedLL = {1,3,2};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(3);
        actualLL.append(2);

        int targetVal = 4;
        int newVal = 5;
        actualLL.insertAfter(targetVal, newVal);
//        System.out.println("actualLL = " + actualLL.toString());

        assertEquals(expectedLength, actualLL.length());
        assertFalse(actualLL.include(newVal));
        assertFalse(actualLL.include(targetVal));
    }

    @Test public void testInsertAfter_insertFront() {
        int[] expectedLL = {1,5,3,2};
        int expectedLength = expectedLL.length;
        LinkedList actualLL = new LinkedList();
        assertTrue(actualLL.isEmpty());

        actualLL.append(1);
        actualLL.append(3);
        actualLL.append(2);

        int targetVal = 1;
        int newVal = 5;
        actualLL.insertAfter(targetVal, newVal);
//        System.out.println("actualLL = " + actualLL.toString());

        assertEquals(expectedLength, actualLL.length());
        assertTrue(actualLL.include(newVal));
        assertTrue(actualLL.include(targetVal));
    }
}
