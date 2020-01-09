package code401challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        int[] testArr = new int[] {4,8,15,16,23,42};
        int testEle = 15;
        int actual = BinarySearch.binarySearch(testArr, testEle);
        assertEquals(2, actual);
    }

    @Test public void testBinarySearchNonExist() {
        int[] testArr = new int[] {11,22,33,44,55,66,77};
        int testEle = 90;
        int actual = BinarySearch.binarySearch(testArr, testEle);
        assertEquals(-1, actual);
    }
}
