package code401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    static Hashtable<Integer, String> testHashTable = new Hashtable<Integer, String>();

    @Test
    public void testHash_withinTheRange() {
        int actual = testHashTable.getHash(4);
        assertEquals(4, actual);
    }

    @Test
    public void testHash_outsideTheRange() {
        int actual = testHashTable.getHash(17);
        assertEquals(1, actual);
    }

    @Test
    public void testAdd() {
        testHashTable.add(1, "blue");
        assertEquals(1, testHashTable.size());
        testHashTable.add(2, "orange");
        assertEquals(2, testHashTable.size());
        testHashTable.add(3, "red");
        assertEquals(3, testHashTable.size());
    }

    @Test
    public void testAdd_keyExisting() {
        testHashTable.add(1, "blue");
        testHashTable.add(2, "orange");
        assertEquals("orange", testHashTable.get(2));
        testHashTable.add(3, "red");
        testHashTable.add(4, "purple");
        assertEquals(4, testHashTable.size());
        testHashTable.add(2, "white");
        assertEquals(4, testHashTable.size());
        assertEquals("white", testHashTable.get(2));
    }

    @Test
    public void testGet() {
        testHashTable.add(1, "blue");
        testHashTable.add(2, "orange");
        testHashTable.add(3, "red");
        assertEquals(3, testHashTable.size());
        assertEquals("blue", testHashTable.get(1));
        assertEquals("orange", testHashTable.get(2));
        assertEquals("red", testHashTable.get(3));
        assertNull(null, testHashTable.get(4));
    }

    @Test
    public void testContain() {
        testHashTable.add(1, "blue");
        testHashTable.add(2, "orange");
        testHashTable.add(3, "red");
        assertEquals(3, testHashTable.size());
        assertTrue(testHashTable.contain(1));
        assertFalse(testHashTable.contain(4));
    }

}
