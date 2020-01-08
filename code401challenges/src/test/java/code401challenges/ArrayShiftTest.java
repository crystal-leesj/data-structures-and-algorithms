package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testEvenNumberArrayShift() {
        int[] startArr = new int[] {2,4,6,8};
        int number = 5;
        int[] expected = {2,4,5,6,8};
        int[] actual = ArrayShift.insertShiftArray(startArr, number);
        assertArrayEquals(expected, actual);
    }
    @Test public void testOddNumberArrayShift() {
        int[] startArr = new int[] {4,8,15,23,42};
        int number = 16;
        int[] expected = {4,8,15,16,23,42};
        int[] actual = ArrayShift.insertShiftArray(startArr, number);
        assertArrayEquals(expected, actual);
    }
}
